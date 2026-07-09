// Last updated: 09/07/2026, 09:52:58
class Solution {
    public int countDigits(int num) {
        int n=0;int m=num;
        while(m>0){
            int r=m%10;
            if(num%r==0){
                n++;
            }
            m=m/10;
        }
        return n;
    }
}