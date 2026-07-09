// Last updated: 09/07/2026, 09:54:02
class Solution {
    public String reverseWords(String s) {
        String w[] = s.split(" ");
        StringBuilder res = new StringBuilder();  
        for (int i = 0; i < w.length; i++) {
            StringBuilder ws = new StringBuilder(w[i]);
          
            res.append(ws.reverse());             
            if (i < w.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}