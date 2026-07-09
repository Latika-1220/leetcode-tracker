// Last updated: 09/07/2026, 09:54:44
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         List<Integer> arr=new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int left=0;
        int right=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]==nums2[right]){
                if(arr.isEmpty()||arr.get(arr.size()-1)!=nums1[left]){
                    arr.add(nums1[left]);
                    
                }
                left++;
                    right++;
            }
            else if(nums1[left]<nums2[right]){
                left++;
            }
            else{
                right++;
            }
        }

        int[] ans=new int[arr.size()];

        for(int i=0;i<ans.length;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}