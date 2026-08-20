// Last updated: 20/08/2026, 11:44:09
1class Solution {
2    public int[] findDiagonalOrder(int[][] mat) {
3        if (mat == null) {
4            throw new IllegalArgumentException("Input matrix is null");
5        }
6        if (mat.length == 0 || mat[0].length == 0) {
7            return new int[0];
8        }
9        int rows = mat.length;
10        int cols = mat[0].length;
11        int[] result = new int[rows * cols];
12        int r = 0;
13        int c = 0;
14        for (int i = 0; i < result.length; i++) {
15            result[i] = mat[r][c];
16            if ((r + c) % 2 == 0) { 
17                if (c == cols - 1) {
18                    r++;
19                } else if (r == 0) {
20                    c++;
21                } else {
22                    r--;
23                    c++;
24                }
25            } else { 
26                if (r == rows - 1) {
27                    c++;
28                } else if (c == 0) {
29                    r++;
30                } else {
31                    r++;
32                    c--;
33                }
34            }
35        }
36        return result;
37    }
38}