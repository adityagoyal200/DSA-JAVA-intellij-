import java.util.Scanner;
public class Occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        System.out.println("Enter the number for occurence:");
        int digit = in.nextInt();
        int occur = 0;
        int remain;
        while(num > 0) {
            remain = num % 10;
            if (remain == digit) {
                occur++;
            }
            num = num / 10;
        }
        System.out.print("occurence is:" + occur);

    }
}
