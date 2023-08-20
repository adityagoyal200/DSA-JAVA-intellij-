/* Questin: Given a non-empty array of integers nums, every element appears twice except for one.
 Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
/*Solution:*/
class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
            for(int i=0;i<len-1;i+=2){
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
    return nums[len - 1];
    }
}
