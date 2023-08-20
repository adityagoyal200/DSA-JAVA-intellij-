/*Question:
You are given a positive integer n. Each digit of n has a sign according to the following rules:
The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.
 */

/*Solution*/

class Solution {
    public int alternateDigitSum(int n){
        int sum = 0;
        int count = 0;
        int num = n;
        char sign = '+';
            while(n>0){
                count++;
                n /= 10;
            }
            if(count%2==0){
                sign = '-';
            }
        n = num;
            while(n>0){
                if(sign == '-'){
                    sum += -1*(n % 10);
                    sign = '+';
                }
                else{
                    sum += (n % 10);
                    sign = '-';
                }
                n/=10;
            }
    return sum;
    }
}
