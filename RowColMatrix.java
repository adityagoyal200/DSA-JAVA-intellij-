public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println(search(matrix,5));
    }
    public static int[] search(int[][]arr, int target){
        int r=0,c=arr.length-1;
        while(r<arr.length&&c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
