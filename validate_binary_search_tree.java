import java.util.*;
public class validate_binary_search_tree {

//     * Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        Stack<TreeNode> point=new Stack();
        Stack<Integer> upp=new Stack(), low=new Stack();
        public void updator(TreeNode pointer,Integer upper,Integer lower){
            point.push(pointer);
            upp.push(upper);
            low.push(lower);
            return;
        }
        public Boolean helper(TreeNode root,Integer upper,Integer lower){
            if(upper!=null&&root.val>=upper)return false;
            if(lower!=null&&root.val<=lower)return false;//notice the importance of =
            if(root.left!=null){
                updator(root.left,root.val,lower);
            }
            if(root.right!=null){
                updator(root.right,upper,root.val);
            }
            return true;

        }
        public boolean isValidBST(TreeNode root) {
            updator(root,null,null);
            while(point.size()!=0){
                if(root==null){
                    point.pop();
                    upp.pop();
                    low.pop();
                    continue;
                }

                if(!helper(point.pop(),upp.pop(),low.pop())){
                    return false;
                }
            }
            return true;
        }

    }
}
