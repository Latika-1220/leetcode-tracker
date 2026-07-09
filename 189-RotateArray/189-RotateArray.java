// Last updated: 09/07/2026, 09:55:40
class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        Collections.rotate(list,k);
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
    }
}