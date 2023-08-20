/*Question:
Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words,
it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.
 */
/*Solution*/
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        long left = 0;
        long right = num;
            while(left<=right){
                long mid = left+(right - left) /2;
                    if(mid*mid == num){
                        return true;
                    }
                    if(mid*mid < num){
                        left = mid+1;
                    }
                    else{
                      right = mid-1;
                    }
            }
    return false;
    }
}
