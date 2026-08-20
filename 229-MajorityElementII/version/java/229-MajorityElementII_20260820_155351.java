// Last updated: 20/08/2026, 15:53:51
1class Solution {
2    public int findMaxLength(int[] nums) {
3        int prefix=0;
4        int maxLen=0;
5        HashMap<Integer,Integer> map=new HashMap<>();
6        map.put(0,0); 
7        for(int i=1;i<=nums.length;i++){
8            if(nums[i-1]==0)
9                prefix--;
10            else
11                prefix++;
12            if(map.containsKey(prefix)){ 
13                int len=i-map.get(prefix);
14                maxLen=Math.max(maxLen,len);    
15            }
16            if(!map.containsKey(prefix)) 
17                map.put(prefix,i);
18        }
19        return maxLen;
20    }
21}