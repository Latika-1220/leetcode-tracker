// Last updated: 09/07/2026, 09:52:48
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int result=arrivalTime+delayedTime;
        return result%24;
    }
}