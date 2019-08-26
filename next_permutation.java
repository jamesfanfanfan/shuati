public class next_permutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            int pointer1=nums.length-1,pointer2=nums.length-1;
            if(nums.length<=1){
                return;
            }
            while(nums[pointer1-1]>=nums[pointer1]){
                if(pointer1==1){
                    Arrays.sort(nums);
                    return;
                }
                pointer1-=1;
            }
            int storer=pointer1;
            while(pointer1<pointer2){
                int a=nums[pointer1];
                nums[pointer1]=nums[pointer2];
                nums[pointer2]=a;
                pointer1+=1;
                pointer2-=1;
            }
            for(int i=storer;i<nums.length;i+=1){
                if(nums[i]>nums[storer-1]){
                    int z=nums[i];
                    nums[i]=nums[storer-1];
                    nums[storer-1]=z;
                    return;
                }
            }
        }
    }
}
