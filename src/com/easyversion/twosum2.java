package com.easyversion;
import java.util.*;
//faster version of the two sum
//the runtime complexity of this algorithm is big o N;
//the space complexity of the algorithm is big o N
//first success version of submission
class twosum2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> helper =new HashMap<>();
        int [] result=new int[2];
        int i=0;
        for(int e:nums){
            if(helper.containsKey(e)&&((2*e)==target)){
                result[0]=helper.get(e);
                result[1]=i;
                return result;
            }
            else if(helper.containsKey(e)&&((2*e)!=target)){
                helper.remove(e);
                i+=1;
                continue;
            }
            helper.put(e,i);
            i+=1;

        }
        for(int e:nums){
            if(helper.containsKey(target-e)){
                if(helper.get(e)!=helper.get(target-e)){
                    result[0]=helper.get(e);
                    result[1]=helper.get(target-e);
                    break;
                }
            }
        }
        return result;
    }
}

//the best version for two_sum
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> helper =new HashMap<>();
//        int [] result=new int[2];
//        int i=0;
//        for(int e:nums){
//
//            helper.put(e,i);
//            i+=1;
//        }
//
//        for(int j=0;j<nums.length;j+=1){
//            if(helper.containsKey(target-nums[j])){
//                if(helper.get(target-nums[j])!=j){
//                    result[0]=j;
//                    result[1]=helper.get(target-nums[j]);
//                    break;
//                }
//            }
//
//        }
//        return result;
//    }
//}

//one way version for two sum(its like ask whether your mr right is in this room before you get into)
// class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> helper =new HashMap<>();
//        int [] result=new int[2];
//        for(int i=0;i<nums.length;i+=1){
//            if(helper.containsKey(target-nums[i])){
//                result[0]=helper.get(target-nums[i]);
//                result[1]=i;
//                return result;
//            }
//            helper.put(nums[i],i);
//        }
//        throw new  IllegalArgumentException("No two sum solution");
//    }
//
//}