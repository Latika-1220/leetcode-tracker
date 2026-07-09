// Last updated: 09/07/2026, 09:54:29
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        Set<Integer> dupli=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int num:nums){
            if(seen.contains(num)){
                if(!dupli.contains(num)){
                    res.add(num);
                    dupli.add(num);
                }
            }
            else{
                seen.add(num);
            }
        }
        return res;
    }
}