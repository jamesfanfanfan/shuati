import java.lang.*;
import java.util.*;

    public class Solution {

        public int removeDuplicates(int[] nums) {
            if(nums.length==0||nums==null){
                return 0;
            }
            StringBuilder sb=new StringBuilder();
            StringBuilder sssb=new StringBuilder();
            char pointera='x';

            for(int i:nums){
                sssb.append(i);
            }
            System.out.println("this is string  helper:"+sssb);
            String helper=sssb.toString();
            for(int i=1;i<nums.length-1;i+=1){
                char a=helper.charAt(i);
                if(a==pointera){
                    continue;
                }
                sb.append(a);
                pointera=a;
            }
            String xs=sb.toString();
            for(int i=0;i<xs.length();i+=1){
                char sdb=xs.charAt(i);
                String hh=Character.toString(sdb);
                System.out.println("this is string  hh:"+hh);
                int ssa=0;
                try {
                    ssa=Integer.parseInt(hh);
                }catch (NumberFormatException e){
                    System.out.println("not a number");
                }
                nums[i]=ssa;
            }


            return sb.capacity();
        }
        public static void main(String [] args){
            int [] sums={1,1,2,2,33,4,4};
            Solution object=new Solution();
            int n=object.removeDuplicates(sums);
            System.out.println(n);
            for(int i:sums){
                System.out.println(i);
            }


        }
    }


