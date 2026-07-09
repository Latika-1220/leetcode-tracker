// Last updated: 09/07/2026, 09:52:29
class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;
        int ans=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            else if((ch>='a')&&(ch<='z')){
                c++;
            }
        }
        if(c>0){
        ans=v/c;
        }
        return ans;
    }
}