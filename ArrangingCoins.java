/*Question:
You have n coins and you want to build a staircase with these coins.
The staircase consists of k rows where the ith row has exactly i coins.
The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.
 */

/*Solution*/

class Solution {
    public int arrangeCoins(int n) {
    int count = 0;
        if(n==1){
            return 1;
        }
    int i=1;
        while(n>0){
            n = n-i;
            i++;
            if(n>=0){
                count++;
            }
        }
    return count;
    }
}
