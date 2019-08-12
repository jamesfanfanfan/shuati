package com.easyversion;
//Time limit exceeded(bad algorithm) Time complexity : O(2^n)O(2n). Size of recursion tree will be 2^n2n
public class climbingstairs {
    class Solution {
        public int climbStairs(int n) {
            return helper(n,0);
        }
        private int helper(int input, int count){
            if(count==input){
                return 1;
            }
            if(count>input){
                return 0;
            }
            int yi=helper(input,count+1);
            int er=helper(input,count+2);
            return yi+er;

        }
    }
}
