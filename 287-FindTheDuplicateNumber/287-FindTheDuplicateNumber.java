// Last updated: 09/07/2026, 09:55:04
class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> seen=new HashSet<>();
       for(int num:nums){
        if(seen.contains(num)){
            return num;
        }
        seen.add(num);
       } 
       return -1;
    }
}