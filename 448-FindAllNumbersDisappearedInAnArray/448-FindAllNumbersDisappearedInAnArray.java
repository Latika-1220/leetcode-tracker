// Last updated: 09/07/2026, 09:54:22
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     int n = nums.length;
     for(int i=0;i<n;i++){
        while(nums[i]!= nums[nums[i]-1]){
            int correct = nums[i]-1;
            int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
        }
     }
     List<Integer> list = new ArrayList<>();
     for(int i=0;i<n;i++){
        if(nums[i]!=i+1){
            list.add(i+1);
        }
     }
     return list;
    }
}