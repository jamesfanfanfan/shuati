package com.easyversion;

public class mergetwosortedlists {
//    Runtime: 1 ms, faster than 28.45% of Java online submissions for Merge Two Sorted Lists.
//    Memory Usage: 38.8 MB, less than 17.85% of Java online submissions for Merge Two Sorted Lists.
//      Definition for singly-linked list.
      public class ListNode {
          int val;
         ListNode next;
          ListNode(int x) { val = x; }
      }

    class Solution {
        ListNode a;
        ListNode b;
        ListNode store;
        ListNode pointer;
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            a=l1;
            b=l2;
            if(a==null){
                store=b;
                return store;
            }
            if(b==null){
                store=a;
                return store;
            }
            if(a.val>b.val){
                store=new ListNode(b.val);
                b=b.next;
            }
            else{
                store=new ListNode(a.val);
                a=a.next;
            }
            pointer=store;
            while((a!=null)||(b!=null)){
                if(a==null){
                    pointer.next=b;
                    break;
                }
                if(b==null){
                    pointer.next=a;
                    break;
                }
                if(a.val>b.val){
                    pointer.next=new ListNode(b.val);
                    b=b.next;
                }
                else {
                    pointer.next=new ListNode(a.val);
                    a=a.next;
                }
                pointer=pointer.next;

            }

            return store;
        }
    }
}

//class Solution {
//
//    ListNode store;
//    ListNode pointer;
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//        if(l1==null){
//            return l2;
//        }
//        if(l2==null){
//            return l1;
//        }
//        pointer=new ListNode(1);
//        store=pointer;
//        while((l1!=null)&&(l2!=null)){
//
//            if(l1.val>l2.val){
//                pointer.next=new ListNode(l2.val);
//                l2=l2.next;
//            }
//            else {
//                pointer.next=new ListNode(l1.val);
//                l1=l1.next;
//            }
//            pointer=pointer.next;
//
//        }
//        if(l1==null){
//            pointer.next=l2;
//
//        }
//        if(l2==null){
//            pointer.next=l1;
//
//        }
//
//        return store.next;
//    }
//}
