/*Question:
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
 */

/*Solution*/


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
            for(int i=0;i<n;i++){
                if(nums[i]!=i){
                    return i;
                }
                if(i==n-1){
                    return i+1;
                }
            }
    return 0;
    }
}
 
