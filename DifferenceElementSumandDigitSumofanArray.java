/*Question:
You are given a positive integer array nums.
The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.
Note that the absolute difference between two integers x and y is defined as |x - y|.
 */

/*Solution*/


class Solution {
    public int differenceOfSum(int[] nums) {
        int n= nums.length;
        int elsum = 0;
        int dsum = 0;
            for(int i=0;i<n;i++){
                elsum += nums[i];
                while(nums[i]>0){
                    dsum += nums[i]%10;
                    nums[i] /= 10;
                }
            }
    return (elsum-dsum);
    }
}
