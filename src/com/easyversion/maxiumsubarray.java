package com.easyversion;
import java.util.*;
//Runtime: 76 ms, faster than 5.05% of Java online submissions for Maximum Subarray.
//Memory Usage: 39.8 MB, less than 6.84% of Java online submissions for Maximum Subarray.
public class maxiumsubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            Stack<Integer> garage=new Stack<>();
            int godseye=nums[0];
            int documenter=0;
            int i=0;
            while(i<nums.length){
                garage.push(nums[i]);
                for(Integer e:garage){

                    documenter+=e;
                }
                if(documenter>godseye){
                    godseye=documenter;
                }
                if(documenter<=0){
                    garage=new Stack<>();
                }
                documenter=0;
                i+=1;
            }
            return godseye;

        }
    }
}
