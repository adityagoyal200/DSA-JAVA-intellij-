/*Question:
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
 */

/*Solution*/


class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int product1 = nums[len-1]*nums[len-2]*nums[len-3];
        int product2 = nums[0]*nums[1]*nums[len-1];
    return Math.max(product1,product2);
    }
}
