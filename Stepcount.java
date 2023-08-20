/*Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2,
 otherwise, you have to subtract 1 from it.
 */

public class Stepcount {
    public static void main(String[] args) {
        System.out.println(step(14));

    }
    public static int step(int num){
        return helper(num,0);
    }
    public static int helper(int num,int st){
        if(num ==0){
            return st;
        }
        if(num%2==0){
            return helper(num/2,st+1);
        }
        return helper(num-1,st+1);
    }
}
