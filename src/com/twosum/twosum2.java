package com.twosum;
import java.util.*;
//faster version of the two sum
//the runtime complexity of this algorithm is big o N;
//the space complexity of the algorithm is big o N
class twosum2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> helper =new HashMap<>();
        int [] result=new int[2];
        int i=0;
        for(int e:nums){
            helper.put(e,i++);
        }
        for(int e:nums){
            if(helper.containsKey(target-e)){
                result[0]=helper.get(e);
                result[1]=helper.get(target-e);
                break;
            }
        }
        return result;
    }
}
