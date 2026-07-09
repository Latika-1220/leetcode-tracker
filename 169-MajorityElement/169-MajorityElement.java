// Last updated: 09/07/2026, 09:55:43
class Solution {
    public int majorityElement(int[] nums) {
        int a=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int c=0;
            a=nums[i];
            for(int j=i+1;j<n;j++){
                if(a==nums[j]){
                    c++;
                }
            }
            if(c>=n/2){
                return a;
            }
        }
        return -1;
    }
}