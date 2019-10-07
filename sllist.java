//DO NOT USE ANY LIBRARIES TO MANIPULATE LISTS
//        THE SORTING ALGORITHM IS THE ONE WE HAVE COVERED IN THE CLASS.
//        you can all functions to create and insert list nodes from the main.
//          Create a single linked list of at least 15 nodes.  The numbers in the list should not be sorted.
//        traverse the list.
//        2. Sort the list in ascending order. Sort in such a manner that the node is unlinked and re-linked at the correct location.
//        traverse the list - it should show the sorted order.
//swap 的时候需要分两个节点是否相邻或不相邻。
//在每次swap完之后指向两个节点的指针位置并不在原始位置，需要重新赋值
//问题是最后三个节点的顺序有可能是乱的
import java.util.Random;
    public class sllist{
        int size;
        private class myNode{
            myNode next;
            int val;
            public myNode(int val){
                this.val=val;
                next=null;
            }
        }
        myNode head=new myNode(-1);
        myNode tail=new myNode(-1);
        public sllist(int a){
            myNode sd=new myNode(a);
            head.next=sd;
            tail.next=sd;
            size=1;
        }
        public void add(int n){
            tail.next.next=new myNode(n);
            tail.next=tail.next.next;
            size+=1;
        }
        public int size(){
            return size;
        }
        public void swap(myNode sa,myNode sb){
            myNode root1=head;
            myNode root2=head;
            while(root1.next!=sa){
                root1=root1.next;
            }
            while(root2.next!=sb){
                root2=root2.next;
            }
            if(sa.next==sb){
                sa.next=sb.next;
                root1.next=sb;
                sb.next=sa;

            }
            else{
                myNode tr=root1.next.next;
                root2.next=sa;
                sa.next=sb.next;
                root1.next=sb;
                sb.next=tr;
            }
            while(tail.next.next!=null){
                tail.next=tail.next.next;
            }
        }
        public static void main(String[] args){
            sllist helper=new sllist(3);
            Random ran=new Random();
            for(int i=0;i<15;i+=1){
                helper.add(ran.nextInt(50));
            }
            myNode ss,bb,contender1,contender2;
            contender1=helper.head;
            ss=helper.head.next;
           while(ss!=null){
               ss=contender1.next;
               contender2=ss;
               if(contender2==null){
                   break;
               }
               bb=contender2.next;
               while(bb!=null) {
                   if (bb.val < ss.val) {
                       helper.swap(ss, bb);
                   }
                   contender2=contender2.next;
                   if(contender2==null){
                       break;
                   }
                   bb = contender2.next;
                   ss=contender1.next;
               }
               contender1=contender1.next;
           }
//           if(contender1.val>contender1.next.val){
//               helper.swap(contender1,contender1.next);
//           }
//           if(contender1.next.val>contender1.next.next.val){
//               helper.swap(contender1.next,contender1.next.next);
//           }
        }
    }




