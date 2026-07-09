// Last updated: 09/07/2026, 09:55:56
class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=c^nums[i];
        }
        return c;
    }
}