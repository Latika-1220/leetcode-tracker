// Last updated: 09/07/2026, 09:55:08
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n=(nums.length*(nums.length+1))/2;
        return n-sum;
    }
}