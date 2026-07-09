// Last updated: 09/07/2026, 09:53:42
class Solution {
    public int minCostToMoveChips(int[] position) {
        int size=position.length;
        int oddcost=0;
        int evencost=0;
        for(int i=0;i<size;i++){
            if(position[i]%2==0){
               evencost++;
            }
            else{
                oddcost++;
            }
        }
            return Math.min(oddcost,evencost);
    }

}