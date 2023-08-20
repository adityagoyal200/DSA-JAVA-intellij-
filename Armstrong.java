import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(number(num));
    }
    static boolean number(int num){
        int same=num;
        int sum =0;
        int remain;
        int cube;
        while(num>0){
            remain = num%10;
            num =num/10;
            sum +=(remain*remain*remain);

        }
        if (sum==same){
            return true;
        }
        return false;
    }
}

