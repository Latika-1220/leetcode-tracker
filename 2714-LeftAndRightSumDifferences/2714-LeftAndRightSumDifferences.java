// Last updated: 09/07/2026, 09:52:51
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int lsum=0;
        int rsum=0;
        int tsum=0;
        for(int num:nums)
            tsum+=num;
            int[] ans=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                rsum=tsum-lsum-nums[i];
                ans[i]=Math.abs(lsum-rsum);
                lsum+=nums[i];
            }
        return ans;    
    }
}