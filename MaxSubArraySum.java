public class MaxSubArraySum {
    public static void main(String[] args) {
       int  arr[] ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubSum(arr));
    }
    public static int maxSubSum(int[] arr){
        int len = arr.length;
        int MaxSum = 0;
        int sum = 0;
        int start =0,end=0;

        for(int i =0;i<len;i++){
            if(sum < 0){
                sum =0;
                start = i;
            }
            sum+= arr[i];
            if(sum > MaxSum){
                MaxSum =sum;
                end = i;
            }
        }

        return MaxSum;
    }
}
