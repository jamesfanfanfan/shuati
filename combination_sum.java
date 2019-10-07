import java.util.*;
public class combination_sum {

        List<List<Integer>> shit=new ArrayList<>();
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<Integer> storer=new ArrayList<>();

                helper(Arrays.copyOfRange(candidates,0,candidates.length),new ArrayList<>(),target,0);

            return shit;
        }
        private void helper(int[] nums,List<Integer> storer,int target, int total){
            if(total==target){
                shit.add(storer);
                return;
            }
            if(total>target){
                return;
            }
            for(int i=0;i<nums.length;i+=1){
                storer.add(nums[i]);
                total+=nums[i];
//                if(total>target){
//                    return;
//                }
                helper(Arrays.copyOfRange(nums,i,nums.length),storer,target,total);
                storer.remove(storer.size()-1);

            }
            //return;
        }
        public static void main(String[] args){
            combination_sum shit=new combination_sum();
            shit.combinationSum(new int[]{2,3,5},7);

        }
}
