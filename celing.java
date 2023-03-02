import java.util.Arrays;
import java.util.Scanner;

public class celing {
    public static void main(String[] args) {
        int[] arr= {0,3,5,7,9,11,13,15};
        System.out.println("your sorted array: ");
        for(int i : arr){
            System.out.println(i);
        }
        int result = search(arr,12);
        System.out.println(result);
    }

    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return arr[end];
    }
}

