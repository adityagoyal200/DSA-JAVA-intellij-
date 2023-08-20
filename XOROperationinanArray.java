/*Question:
You are given an integer n and an integer start.
Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
Return the bitwise XOR of all elements of nums.
 */
/*Solution*/
class Solution {
    public int xorOperation(int n, int start) {
        int num = 0,sol=0;
            for(int i=0;i<n;i++){
                num= start + 2*i;
                sol= sol^num;
            }
    return sol;
    }
}
