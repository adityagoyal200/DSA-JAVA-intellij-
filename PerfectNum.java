/*A perfect number is a positive integer that is equal
to the sum of its positive divisors, excluding the number itself.
 A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false.
 */

public class PerfectNum {
    public boolean checkPerfectNumber(int num) {
        int no = 0;
        if(num%2 != 0){
            return false;
        }
        else{
            for(int i=1;i <= num/2;i++){
                if(num%i == 0){
                    no+= i;
                }
            }
        }
        return no == num;
    }
}
