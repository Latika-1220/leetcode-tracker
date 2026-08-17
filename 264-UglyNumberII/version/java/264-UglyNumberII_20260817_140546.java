// Last updated: 17/08/2026, 14:05:46
1class Solution {
2    public int nthUglyNumber(int n) {
3        int c2 = 0,c3 = 0,c5 = 0;
4        int[] dp = new int[n+1];
5        dp[0] = 1;
6        for(int i=1;i<=n;i++)
7        {
8            dp[i] = Math.min(2*dp[c2],Math.min(3*dp[c3],dp[c5]*5));
9            if(dp[i] == 2*dp[c2])
10                c2++;
11            if(dp[i] == 3*dp[c3])
12                c3++;
13            if(dp[i] == 5*dp[c5])
14                c5++;
15        }
16        return dp[n-1];
17    }
18}