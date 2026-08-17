// Last updated: 17/08/2026, 18:05:40
1class Solution {
2    public int smallestRangeI(int[] nums, int k) {
3        int maxi = Integer.MIN_VALUE;
4        int mini = Integer.MAX_VALUE;
5        int n = nums.length;
6        for(int i=0;i<n;i++)
7            {
8                maxi = Math.max(nums[i],maxi);
9                mini = Math.min(nums[i],mini);
10            }
11        int ans = Math.abs(maxi-mini)-2*k;
12        if(ans<0)ans=0;
13        return ans;
14    }
15}