/*Question:
You are given an integer array nums and an integer k.
In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x
where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.
The score of nums is the difference between the maximum and minimum elements in nums.
Return the minimum score of nums after applying the mentioned operation at most once for each index in it.
 */
/*Solution*/
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int len = nums.length;
        int min = nums[0];
        int max = nums[0];
            for(int i=0;i<len;i++){
                max=Math.max(max,nums[i]);
                min=Math.min(min,nums[i]);
            }
        int score = (max-k)-(min+k);
    return (score>0) ? score: 0;
    }
}
