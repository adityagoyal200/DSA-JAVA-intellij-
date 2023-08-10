import java.util.HashMap;

public class SubArrayWithSumK {
    public static int lengthOfSubarray(int[] arr,int k){
        HashMap<Integer,Integer> subArray = new HashMap<>();
        int sum=0;
        int maxLen = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen = Math.max(maxLen,i+1);
            }
            //calculating the sum of remaining part i.e x-k
            int rem = sum-k;

            //calculate the length and upadte
            if(subArray.containsKey(rem)){
                int len = i-subArray.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            //finally update the map checking the condition

            if(!subArray.containsKey(sum)){
                subArray.put(sum,i);
            }

        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,1,1,1,4,2,3};
        System.out.println(lengthOfSubarray(arr,3));
    }
}
//this will only work for positives but not zero or negatives
// just slight change
//if(!subArray.containsKey(sum)){
//        subArray.put(sum,i);
//        }