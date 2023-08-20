/*Question :
You are given a positive integer arrivalTime denoting the arrival time of a train in hours,
and another positive integer delayedTime denoting the amount of delay in hours.
Return the time when the train will arrive at the station.
Note that the time in this problem is in 24-hours format.
 */

/*Solution*/


class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum = 0 ;
            sum = arrivalTime + delayedTime;
    return (sum%24);
    }
}
