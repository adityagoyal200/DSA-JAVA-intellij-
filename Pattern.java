import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        try{
            Float f1 = new Float("3.0");
            int x= f1.intValue();
            byte b= f1.byteValue();
            double d=f1.doubleValue();
            System.out.println(x+b+d);
        }
        catch (NumberFormatException e){
            System.out.println("bad");
        }
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(4);


    }
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i=1;i<2*n;i++){
           int totalCol = i > n ? 2*n-i :i;
           for(int col=0;col<totalCol;col++){
               System.out.print("*");
           }
            System.out.println();
        }

    }

    public static void pattern6(int n){
        for(int i = 1; i < 2*n; i++){
            int totalCol = i > n ? 2*n-i : i;

            int spaces=n-totalCol;

            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < totalCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern7(int n){
        for(int i = 1; i < n; i++){
            int spaces=n-i;

            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            for(int col = i; col>=1 ; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= i; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }

    public static void pattern8(int n){
        for(int i = 1; i < 2*n; i++){
            int totalCols = i > n ? 2*n-i : i;
            int spaces=n-totalCols;

            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            for(int col = totalCols; col>=1 ; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= totalCols; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for(int i = 1; i <= n; i++){

            for(int c = 1; c <= i; c++){
                System.out.print(c);
            }

            for(int s = 1; s <= 2*n - 2*i; s++){
                System.out.print(" ");
            }

            for(int c = i; c >= 1; c--){
                System.out.print(c);
            }

            System.out.println();
        }
    }



}
