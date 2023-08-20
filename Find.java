import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,4,5};
        System.out.println(fin(arr,4,0));
        System.out.println(findind(arr,4,0));
        findall(arr, 4, 0);
        System.out.println(list);

    }
    static boolean fin(int[] arr,int target,int ind){
        if(ind== arr.length){
            return false;
        }
        return arr[ind]==target || fin(arr,target,ind+1);
    }
    static int findind(int[]arr,int target,int ind){
        if(ind==arr.length){
            return -1;
        }
        if(arr[ind]==target){
            return ind;
        }
        else {
            return findind(arr, target, ind+1);
        }
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findall(int[] arr,int target,int ind){
        if(ind== arr.length){
            return;
        }
        if(arr[ind]==target){
            list.add(ind);
        }
        findall(arr, target, ind+1);

    }
}
