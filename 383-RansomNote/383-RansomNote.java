// Last updated: 09/07/2026, 09:54:43
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count=new int[26];
        for(int i=0;i<magazine.length();i++){
            char m=magazine.charAt(i);
            count[m-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char r=ransomNote.charAt(i);
            if(count[r-'a']==0){
                return false;
            }
            count[r-'a']--;
        }
        return true;
    }
}