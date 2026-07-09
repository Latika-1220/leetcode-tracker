// Last updated: 09/07/2026, 09:53:23
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            String str=words[i];
            boolean isValid = true;
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                if(allowed.indexOf(ch)==-1){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                count++;
            }
        }
        return count;
    }
}