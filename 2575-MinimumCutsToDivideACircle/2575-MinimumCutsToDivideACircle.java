// Last updated: 09/07/2026, 09:52:59
class Solution {
    public int numberOfCuts(int n) {
        if(n==1){
            return 0;
            
        }
        return n%2>0?n:n/2;
        
    }
}