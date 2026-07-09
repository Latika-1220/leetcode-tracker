// Last updated: 09/07/2026, 09:54:59
class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<31;i++){
            if((long)Math.pow(3,i)==n){
                return true;
            }
        }
        return false;
    }
}