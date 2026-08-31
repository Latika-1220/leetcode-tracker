// Last updated: 31/08/2026, 11:21:05
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n=nums.length;
4        int d[]=new int[n];
5        for(int i=0;i<n;i++){
6            d[i]=1;
7        }
8        for(int i=1;i<n;i++){
9            for(int j=0;j<i;j++){
10                if(nums[i]>nums[j]){
11                    d[i]=Math.max(d[i],d[j]+1);
12                }
13            }
14        }
15        int ans=0;
16        for(int i=0;i<n;i++){
17            ans=Math.max(ans,d[i]);
18        }
19        return ans;
20    }
21}