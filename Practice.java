import java.util.Scanner;

    public class Practice{
        public static void main(String[] args) {
            int[] prac = new int[10];
            Scanner obj = new Scanner(System.in);
            System.out.println("enter the array: ");
            for (int i = 0; i < prac.length; i++) {
                prac[i]=obj.nextInt();
            }
            System.out.println("the array entered is: ");
            for(int i=0;i<prac.length;i++){
                System.out.print(prac[i] + " ");
            }
            System.out.println(search(prac,4));
        }
//        static  int linearSearch(int[] arr, int target){
//            if(arr.length==0){
//                return -1;
//            }
//            for(int i=0;i<arr.length;i++){
//                if(arr[i]==target){
//                    return i;
//                }
//            }
//            System.out.println("not found");
//            return -1;
//        }
        static int search(int[] array,int target){
            if(array.length==0){
                return -1;
            }
            for(int j=0;j<array.length;j++) {
                if (array[j] == target) {
                    return j;
                }
            }
            return -1;
        }
    }




