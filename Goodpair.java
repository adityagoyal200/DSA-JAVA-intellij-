/*Question :
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
/*Solution*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count =0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                }
            }
    return count;
    }
}
