// Last updated: 20/08/2026, 11:39:23
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int n = nums.length;
4        Map<Integer, Integer> map = new HashMap<>();
5        List<Integer> result = new ArrayList<>();
6        for (int i = 0; i < n; i++) {
7            int num = nums[i];
8            if (map.containsKey(num)) {
9                map.put(num, map.get(num) + 1);
10            }
11            else {
12                map.put(num, 1);
13            }
14        }
15        for (int i = 0; i < n; i++) {
16           if (map.containsKey(nums[i]) &&
17                map.get(nums[i]) > n / 3) {
18                result.add(nums[i]);
19                map.remove(nums[i]);
20            }
21        }
22        return result;
23    }
24}