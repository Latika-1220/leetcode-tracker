// Last updated: 09/07/2026, 09:56:31
class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            max=Math.max(max,i+nums[i]);
        }
        return true;
    }
}