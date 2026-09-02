// Last updated: 02/09/2026, 09:59:01
1class Solution {
2    public int[] findColumnWidth(int[][] grid) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        int[] ans = new int[n];
8
9        for (int j = 0; j < n; j++) {
10
11            int max = 0;
12
13            for (int i = 0; i < m; i++) {
14
15                int num = grid[i][j];
16
17                int length = String.valueOf(num).length();
18
19                if (length > max) {
20                    max = length;
21                }
22            }
23
24            ans[j] = max;
25        }
26
27        return ans;
28    }
29}