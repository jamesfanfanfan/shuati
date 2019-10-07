import java.util.*;
public class binary_tree_indorer_traversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {

            List<Integer> ls=new ArrayList();
            Set<TreeNode> storer=new HashSet();
            Deque<TreeNode> dq=new ArrayDeque();
            if(root==null){
                return ls;
            }
            dq.addFirst(root);
            TreeNode pointer;
            while(dq.size()>0){
                if(dq.peek().left==null||storer.contains(dq.peek().left)){
                    pointer=dq.removeFirst();
                    ls.add(pointer.val);
                    storer.add(pointer);
                    if(pointer.right!=null){
                        dq.addFirst(pointer.right);
                    }
                }
                else dq.addFirst(dq.peek().left);

            }
            return ls;
        }
    }
}
