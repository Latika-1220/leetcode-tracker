// Last updated: 09/07/2026, 09:53:36
class Solution {
    public int numberOfSteps(int num) {
       
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                count++;

            }else {
                num-=1;
                count++;
            }
        }
        return count;
    }
}