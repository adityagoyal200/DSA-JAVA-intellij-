import java.util.Scanner;

public class binayseach {
    public static void main(String[] args) {
        int[] arr= new int[10];
        System.out.println("enter your sorted array: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result=search(arr,12);
        System.out.println(result);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+(end-start))/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}