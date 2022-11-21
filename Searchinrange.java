import java.util.Scanner;

public class Searchinrange {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("enter the elements of array: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("the entered array is: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        if (linearSearch(array, 1,array.length,5) > -1) {
            System.out.println("the element is present at: " + linearSearch(array, 1,array.length,5) + " index");
        }
    }

    static  int linearSearch(int[] arr, int start , int end,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        System.out.println("not found");
        return -1;
    }
}


