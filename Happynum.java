/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a
cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

 */
public class Happynum {
    public boolean isHappy(int n) {
        int rem = 0;
        int square = 0;
        while(n>0){
            rem = n%10;
            square+= rem*rem;
            n/=10;
        }
        if(square == 1){
            return true;
        }
        if(square == 4){
            return false;
        }
        return isHappy(square);
    }
}
