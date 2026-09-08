// Last updated: 08/09/2026, 10:01:33
1class Solution {
2    public int maximumGap(int[] nums) {        
3        int n = nums.length; 
4        if (n < 2) {
5            return 0;
6        }
7        int min = nums[0];
8        int max = nums[0];
9        for (int i = 1; i < n; i++) {
10            min = Math.min(min, nums[i]);
11            max = Math.max(max, nums[i]);
12        }
13        if (min == max) {
14            return 0;
15        }
16        int bucketSize = Math.max(1, (max - min) / (n - 1));
17        int bucketCount = (max - min) / bucketSize + 1;        
18        int[] bucketMin = new int[bucketCount];
19        int[] bucketMax = new int[bucketCount];        
20        for (int i = 0; i < bucketCount; i++) {
21            bucketMin[i] = Integer.MAX_VALUE;
22            bucketMax[i] = Integer.MIN_VALUE;
23        }
24        for (int num : nums) {
25            int index = (num - min) / bucketSize;            
26            bucketMin[index] = Math.min(bucketMin[index], num);
27            bucketMax[index] = Math.max(bucketMax[index], num);
28        }        
29        int maximumGap = 0;
30        int previousMax = min;
31        for (int i = 0; i < bucketCount; i++) {
32            if (bucketMin[i] == Integer.MAX_VALUE) {
33                continue;
34            }            
35            maximumGap = Math.max(maximumGap, bucketMin[i] - previousMax);            
36            previousMax = bucketMax[i];
37        }
38        
39        return maximumGap;
40    }
41}