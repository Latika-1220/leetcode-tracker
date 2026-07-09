// Last updated: 09/07/2026, 09:55:16
class Solution {
    public int addDigits(int num) {
        int sum=0;
        if(num==0) return 0;
        int res=((num%9)==0?9:num%9);
        return res;
    }
}