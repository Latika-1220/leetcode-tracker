// Last updated: 09/07/2026, 09:57:11
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            HashSet<Character> set = new HashSet<>();
            int length = 0;

            for (int j = i; j < s.length(); j++) {

                if (set.contains(s.charAt(j))) {
                    break;
                }

                set.add(s.charAt(j));
                length++;

                if (length > max) {
                    max = length;
                }
            }
        }

        return max;
    }
}