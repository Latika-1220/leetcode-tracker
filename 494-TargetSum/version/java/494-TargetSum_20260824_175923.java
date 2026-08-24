// Last updated: 24/08/2026, 17:59:23
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        int n = s.length();
4        for (int len = 1; len <= n / 2; len++) {
5            if (n % len == 0) {
6                boolean same = true;
7                for (int i = len; i < n; i++) {
8                    if (s.charAt(i) != s.charAt(i % len)) {
9                        same = false;
10                        break;
11                    }
12                }
13                if (same) {
14                    return true;
15                }
16            }
17        }
18        return false;
19    }
20}