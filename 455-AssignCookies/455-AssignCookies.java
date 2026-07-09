// Last updated: 09/07/2026, 09:54:11
class Solution {
    public int findContentChildren(int[] children, int[] cookies) {
        if(children.length == 0 || cookies.length == 0) {
            return 0;
        }
        Arrays.sort(children);
        Arrays.sort(cookies);
        int content = 0;
        int childIndex = 0;
        for(int i=0; i < cookies.length && childIndex < children.length; i++) {
            if(cookies[i] >= children[childIndex]) {
                childIndex++;
                content++;
            } 
        }
        return content;
    }
}