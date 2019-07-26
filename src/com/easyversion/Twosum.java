package com.easyversion;

//brutal version
//the runtime complexity of this algorithm is big o n*2
//the space complexity of this algorithm is big o 1;
class Solution {
    public int[] twoSum(int[] nums, int target) {
            int count = nums.length;
            int[] result = new int[2];
            for (int i = 0; i < count - 1; i += 1) {
                for (int j = i + 1; j < count; j += 1) {
                    if ((nums[j] + nums[i]) == target) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
            return result;
    }
}

