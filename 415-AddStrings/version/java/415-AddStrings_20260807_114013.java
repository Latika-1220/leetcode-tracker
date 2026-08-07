// Last updated: 07/08/2026, 11:40:13
1class Solution {
2    public String addStrings(String num1, String num2) {
3        String ans = "";
4        int i = num1.length() - 1;
5        int j = num2.length() - 1;
6        int carry = 0;
7
8        while (i >= 0 || j >= 0 || carry != 0) {
9            int sum = carry;
10
11            if (i >= 0) {
12                sum += num1.charAt(i) - '0';
13                i--;
14            }
15
16            if (j >= 0) {
17                sum += num2.charAt(j) - '0';
18                j--;
19            }
20
21            ans = (sum % 10) + ans;
22            carry = sum / 10;
23        }
24
25        return ans;
26    }
27}