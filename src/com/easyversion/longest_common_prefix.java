package com.easyversion;

//Runtime: 3 ms, faster than 9.26% of Java online submissions for Longest Common Prefix.
//        Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Longest Common Prefix.
import java.util.*;

public class longest_common_prefix {
    class Solution {
        private class Node{
            char x;
            Map<Character,Node> next;
            public Node(){
                x='0';
                next=new HashMap<>();
            }
            public Node(char y){
                x=y;
                next=new HashMap<>();
            }
        }
        public String longestCommonPrefix(String[] strs){
            if(strs.length==0){
                return "";
            }

            Node root=new Node();
            Node james;
            for(String x: strs){
                james=root;
                char [] array=x.toCharArray();
                for(char m:array){
                    if(james.next.containsKey(m)){
                        james=james.next.get(m);
                        continue;
                    }
                    james.next.put(m,new Node(m));
                    james=james.next.get(m);
                }
            }
            int z=strs[0].length();
            int sss=0;
            for(int i=0;i<strs.length;i+=1){
                if(strs[i].length()<z){
                    z=strs[i].length();
                    sss=i;
                }
            }
            StringBuilder s=new StringBuilder();
            int i=0;
            james=root;
            char [] array=strs[sss].toCharArray();
            for(char x: array){
                if(james.next.size()>1||james.next.size()==0){
                    break;
                }
                s.append(strs[0].charAt(i));
                james=james.next.get(strs[0].charAt(i));
                i+=1;
            }
            return s.toString();

        }
    }
}
