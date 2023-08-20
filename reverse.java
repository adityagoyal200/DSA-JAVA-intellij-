import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        int remain;
        int rev = 0;
        while(num > 0){
            remain = num % 10;
            num/=10;
            rev = (rev*10) + remain;

        }
        System.out.print("reverse number is "+ rev);
    }
}
