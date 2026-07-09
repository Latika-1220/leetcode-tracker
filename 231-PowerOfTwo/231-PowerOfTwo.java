// Last updated: 09/07/2026, 09:55:28
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
         return(n & (n - 1)) == 0 ;
    }
}
