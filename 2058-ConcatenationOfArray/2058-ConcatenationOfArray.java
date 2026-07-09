// Last updated: 09/07/2026, 09:53:17
import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> t=new ArrayList<>();
        for(int num:nums){
            t.add(num);
        }
        for(int num:nums){
            t.add(num);
        }
        int arr[]=new int[t.size()];
        for(int i=0;i<t.size();i++){
            arr[i]=t.get(i);
        }
        return arr;
    }
}