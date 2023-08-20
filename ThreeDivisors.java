/*Question:
Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
An integer m is a divisor of n if there exists an integer k such that n = k * m.
 */
/*Solution*/
class Solution {
    public boolean isThree(int n) {
        int count = 0;
        if(n<3){
            return false;
        }
        for (int i=2;i<= n/2;i++) {
            if (n%i == 0){
                count++;
            }
            if (count>1){
                return false;
            }
        }
        return count != 0;
    }
}
