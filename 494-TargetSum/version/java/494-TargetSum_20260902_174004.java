// Last updated: 02/09/2026, 17:40:04
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        return solve(nums, 0, 0, target);
4    }
5
6    public int solve(int[] nums, int index, int sum, int target) {
7        if (index == nums.length) {
8            if (sum == target) {
9                return 1;
10            }
11            return 0;
12        }
13
14        int plus = solve(nums, index + 1, sum + nums[index], target);
15
16        int minus = solve(nums, index + 1, sum - nums[index], target);
17
18        return plus + minus;
19    }
20}