// Last updated: 19/08/2026, 17:37:24
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3	Arrays.sort(nums1);
4	Arrays.sort(nums2);
5	int top = 0;
6	int bottom = 0;
7	List<Integer> h = new ArrayList<>();
8
9	while (true){
10		if (top >= nums1.length || bottom >= nums2.length){
11			break;
12		}
13		if (nums1[top] == nums2[bottom]){
14			h.add(nums1[top]);
15			top ++;
16			bottom ++;
17		}
18		else if (nums1[top] < nums2[bottom]){
19			top ++;
20		}
21		else if (nums1[top] > nums2[bottom]){
22			bottom ++;
23		}
24	}
25
26	int[] g = new int[h.size()];
27	for (int i = 0; i < h.size(); i++) {
28		g[i] = h.get(i);
29	}
30	return g;
31}
32}