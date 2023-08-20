/* Question : Given an integer array nums sorted in non-decreasing order,
 return an array of the squares of each number sorted in non-decreasing order.
 */
/*Solution*/ 
class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int [] sqr = new int [len];
            for(int i=0;i<len;i++){
                sqr[i] = nums[i]*nums[i];
            }
            Arrays.sort(sqr);
    return sqr;
    }
}
