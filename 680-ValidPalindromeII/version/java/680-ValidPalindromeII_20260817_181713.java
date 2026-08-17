// Last updated: 17/08/2026, 18:17:13
1class Solution {
2    private boolean isPalindrome(String s, int left, int right) {
3        while (left < right) {
4            if (s.charAt(left) == s.charAt(right)) {
5                left++;
6                right--;
7            }
8            else {
9                return false;
10            }
11        }
12        return true;
13    }
14    public boolean validPalindrome(String s) {
15        int left = 0;
16        int right = s.length() - 1;
17        while (left < right) {
18            if (s.charAt(left) == s.charAt(right)) {
19                left++;
20                right--;
21            }
22            else {
23                return isPalindrome(s, left + 1, right)
24                        || isPalindrome(s, left, right - 1);
25            }
26        }
27        return true;
28    }
29}