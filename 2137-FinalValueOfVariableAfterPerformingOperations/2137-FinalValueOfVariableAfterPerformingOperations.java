// Last updated: 09/07/2026, 09:53:13
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(1)=='+'){
                value++;
            }
            else{
                value--;
            }
        }
        return value;
    }
}