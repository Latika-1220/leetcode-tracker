// Last updated: 09/07/2026, 09:55:47
class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                temp=i;
            }
        }
        return temp;
    }
}