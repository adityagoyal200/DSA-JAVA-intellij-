/*Question:
You are given an integer array nums. The unique elements of an array are the
elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.
 */
/*Solution*/
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int n = nums.length;
            for(int i=0;i<n;i++){
                int count = 0;
                for(int j=0;j<n;j++){
                    if(i == j){
                        continue;
                    }
                    if(nums[j] == nums[i]){
                        count++;
                    }
                }
                if(count == 0){
                    sum+= nums[i];
                }
            }
    return sum;
    }
}
