/*Question:
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
 unique element appears only once. The relative order of the elements should be kept the same.
 Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were
present in nums initially.
The remaining elements of nums are not important as well as the size of nums.
Return k.
 */

/*Solution*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
            if(len == 0){
                return 0;
            }
            else{
                int num = 0 ;
                for(int i=0;i<len;i++){
                    if(nums[num]!=nums[i]){
                        num++;
                        nums[num]=nums[i];
                    }
                }
            return num+1;
            }
    }
}
 
