import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
         for(int i=0;i<arr.length;i++){
             int last=arr.length-i-1;
             int max=getMax(arr,0,last);
             swap(arr,max,last);
         }
    }
    public static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static int getMax(int[]arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
