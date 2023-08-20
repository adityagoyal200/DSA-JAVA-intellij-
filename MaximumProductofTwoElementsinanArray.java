/*Question:
Given the array of integers nums, you will choose two different indices i and j of that array.
Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */

/*Solution*/

class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
    return ((nums[len-1]-1)*(nums[len-2]-1));
    }
}
