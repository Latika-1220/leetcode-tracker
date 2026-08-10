// Last updated: 10/08/2026, 14:42:15
1class Solution {
2    public String getHint(String secret, String guess) {
3    int bulls = 0;
4    int cows = 0;
5    int[] numbers = new int[10];
6    for (int i = 0; i<secret.length(); i++) {
7        int s = Character.getNumericValue(secret.charAt(i));
8        int g = Character.getNumericValue(guess.charAt(i));
9        if (s == g) bulls++;
10        else {
11            if (numbers[s] < 0) cows++;
12            if (numbers[g] > 0) cows++;
13            numbers[s] ++;
14            numbers[g] --;
15        }
16    }
17    return bulls + "A" + cows + "B";
18}
19}