// Last updated: 09/07/2026, 09:52:27
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1=nums1[0],min2=nums2[0];
        for(int i=0;i<nums1.length;i++){
            min1=Math.min(min1,nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            min2=Math.min(min2,nums2[j]);
        }
        return min2-min1;
    }
}