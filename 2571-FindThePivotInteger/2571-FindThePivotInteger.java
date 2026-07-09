// Last updated: 09/07/2026, 09:53:00
class Solution {
    public int pivotInteger(int n) {
        
        if(n==1) return 1;
        
        int total=(n*(n+1))/2;
        for(int i=1; i<n; i++){
            int left=(i*(i+1))/2;
            int right=total-left+i;
            if(left==right) return i;
        }
        return -1;
    }
}
 