// Last updated: 09/07/2026, 09:56:49
class Solution {
    public int divide(int dividend, int divisor) {
        int ans=dividend/divisor;
        if(dividend==-2147483648&&divisor==-1){
//ans=dividend/divisor;
            return 2147483647;
        }
        return ans;
    }
}