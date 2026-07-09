// Last updated: 09/07/2026, 09:55:38
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            int num=n%2;
            if(num==1) count++;
            n=n/2;
        }
        return count;
    }
}