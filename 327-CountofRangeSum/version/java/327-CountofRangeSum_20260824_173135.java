// Last updated: 24/08/2026, 17:31:35
1class Solution {
2    public int countRangeSum(int[] nums, int lower, int upper) {
3    int n = nums.length;
4    long[] sums = new long[n + 1];
5    for (int i = 0; i < n; ++i)
6        sums[i + 1] = sums[i] + nums[i];
7    return countWhileMergeSort(sums, 0, n + 1, lower, upper);
8}
9
10private int countWhileMergeSort(long[] sums, int start, int end, int lower, int upper) {
11    if (end - start <= 1) return 0;
12    int mid = (start + end) / 2;
13    int count = countWhileMergeSort(sums, start, mid, lower, upper) 
14              + countWhileMergeSort(sums, mid, end, lower, upper);
15    int j = mid, k = mid, t = mid;
16    long[] cache = new long[end - start];
17    for (int i = start, r = 0; i < mid; ++i, ++r) {
18        while (k < end && sums[k] - sums[i] < lower) k++;
19        while (j < end && sums[j] - sums[i] <= upper) j++;
20        while (t < end && sums[t] < sums[i]) cache[r++] = sums[t++];
21        cache[r] = sums[i];
22        count += j - k;
23    }
24    System.arraycopy(cache, 0, sums, start, t - start);
25    return count;
26}
27}