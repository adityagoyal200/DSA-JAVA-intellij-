/*Question:
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
 */
/*Solution*/
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum=0;
        int nsum=0;
        for(int i=0;i<n;i++){
            sum = nums[i];
            nsum = nsum+ sum;
             nums[i]=nsum;
        }
    return nums;
    }
}
