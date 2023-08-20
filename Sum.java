/* Question :
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
A subarray is a contiguous subsequence of the array.
 */
/*Solution*/
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n=arr.length;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j=j+2){
                    for(int k=i;k<=j;k++){
                        sum+=arr[k];
                    }
                }
            }
    return sum;
}
}
