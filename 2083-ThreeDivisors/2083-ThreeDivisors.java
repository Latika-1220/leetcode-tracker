// Last updated: 09/07/2026, 09:53:16
class Solution {
    public boolean isThree(int n) {
        int n1=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                n1++;
            }
        }
        if(n1==3)
        {
            return true;
        }
        return false;
    }
}