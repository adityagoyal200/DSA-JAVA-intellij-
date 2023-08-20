/*Question:
There is a function signFunc(x) that returns:
1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.
Return signFunc(product).
 */
/*Solution*/
class Solution {
    public int arraySign(int[] nums){
        int negative = 0;
        int len = nums.length;
            for(int i=0;i<len;i++){
                if(nums[i]<0){
                    negative++;
                }
                if(nums[i]==0){
                    return 0;
                }
            }
            if(negative%2==0){
                return 1;
            }
            else{
                return (-1);
            }
    }
}
