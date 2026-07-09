// Last updated: 09/07/2026, 09:53:25
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles>=numExchange){
            int newBottles=numBottles/numExchange;
            int remBottles= numBottles % numExchange;
            ans=ans+newBottles;
            numBottles=newBottles+remBottles;
        }
        return ans;
    }
}