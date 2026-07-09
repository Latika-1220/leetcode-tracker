// Last updated: 09/07/2026, 09:54:54
class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<31;i++){
            if((long)Math.pow(4,i)==n) return true;
        }
        return false;
    }
}