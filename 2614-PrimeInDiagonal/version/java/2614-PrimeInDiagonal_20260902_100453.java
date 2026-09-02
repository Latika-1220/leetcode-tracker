// Last updated: 02/09/2026, 10:04:53
1class Solution {
2    public int diagonalPrime(int[][] nums) {
3
4        int n = nums.length;
5        int maxPrime = 0;
6
7        for (int i = 0; i < n; i++) {
8
9            // First diagonal
10            int num1 = nums[i][i];
11
12            if (num1 > 1) {
13                boolean prime = true;
14
15                for (int j = 2; j * j <= num1; j++) {
16                    if (num1 % j == 0) {
17                        prime = false;
18                        break;
19                    }
20                }
21
22                if (prime && num1 > maxPrime) {
23                    maxPrime = num1;
24                }
25            }
26
27            // Second diagonal
28            int num2 = nums[i][n - i - 1];
29
30            if (num2 > 1) {
31                boolean prime = true;
32
33                for (int j = 2; j * j <= num2; j++) {
34                    if (num2 % j == 0) {
35                        prime = false;
36                        break;
37                    }
38                }
39
40                if (prime && num2 > maxPrime) {
41                    maxPrime = num2;
42                }
43            }
44        }
45
46        return maxPrime;
47    }
48}