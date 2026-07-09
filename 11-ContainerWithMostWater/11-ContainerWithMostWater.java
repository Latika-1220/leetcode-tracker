// Last updated: 09/07/2026, 09:57:05
class Solution {
    public int maxArea(int[] height) {
        int maxA=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            maxA=Math.max(maxA,(r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxA;
    }
}