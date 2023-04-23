import java.util.Arrays;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(33));
        int num=33;
        int[] dp=new int[num+1];
        System.out.println(fib(num,dp));
        System.out.println(fibonac(33));
    }

   public static int fibo(int n){
        int[] dp = new int[ n+1];
        dp[0]=0;
        dp[1]=1;

        for( int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
//       if(n<=1){
//           return n;
//       }
//       return fibo(n-1)+fibo(n-2);
   }
   public static int fib(int n, int[]dp){
        if(n<=1){
            return n;
        }
        dp[n]=fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
   }
   public static int fibonac(int n){
        int prev2=0;
        int prev=1;
        for(int i=2;i<=n;i++){
            int sum=prev+prev2;
            prev2=prev;
            prev=sum;
        }
        return prev;
   }
}
//0 1 1 2 3 5 8 13 21