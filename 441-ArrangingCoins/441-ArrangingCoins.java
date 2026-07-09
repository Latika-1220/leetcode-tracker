// Last updated: 09/07/2026, 09:54:32
class Solution {
    public int arrangeCoins(int n) {
        int row = 1,count = 0;
        while(n>0) {
            n-=row++;
            if(n>=0) {
                count++;
            }
        }
        return count;
    }
}