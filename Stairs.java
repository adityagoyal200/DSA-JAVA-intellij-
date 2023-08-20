/*Question: You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
/*Solution*/
class Solution {
    public int climbStairs(int n) {
        int step1 = 1;
        int step2 = 2;
            if(n==1  || n==2){
                return n;
            }
            for(int i=3;i<=n;i++){
                int step = step1;
                step1 = step2;
                step2 = step + step2;
            }
    return step2;
    }
}
