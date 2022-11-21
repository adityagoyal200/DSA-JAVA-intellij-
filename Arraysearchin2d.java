import java.util.Arrays;

public class Arraysearchin2d {
    public static void main(String[] args) {
        int[][] arr={
            {23,4,1},
            {18,12,3,9},
            {12,12,1,1}
        };
        int target =1;
        int[] ans= search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] array,int tar){

        for(int row=0;row< array.length;row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == tar) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{};
    }
}
