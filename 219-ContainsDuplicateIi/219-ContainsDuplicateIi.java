// Last updated: 09/07/2026, 09:55:30
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length&&j<=i+k;j++){
                if(nums[i]==nums[j]){
                   
                        return true;
                    
                }
            }
        }
        return false;
    }
}