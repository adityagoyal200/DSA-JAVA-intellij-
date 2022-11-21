import java.util.Scanner;

public class Linear{
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("enter the elements of array: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("the entered array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        if (linearSearch(array, 7) > -1) {
            System.out.println("the element is present at: " + linearSearch(array, 7) + " index");
        }
    }

    static  int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        System.out.println("not found");
        return -1;
    }
}
