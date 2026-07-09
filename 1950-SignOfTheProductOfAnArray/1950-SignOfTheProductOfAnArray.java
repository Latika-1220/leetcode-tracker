// Last updated: 09/07/2026, 09:53:18
class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0; 
        boolean hasZero = false; 
        for (int num : nums) {
            if (num < 0) {
                negativeCount++;
            } else if (num == 0) {
                hasZero = true;
                break; 
            }
        }
        if (hasZero) {
            return 0; 
        }
        return (negativeCount % 2 == 0) ? 1 : -1;
    }
    public static int signFunc(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}