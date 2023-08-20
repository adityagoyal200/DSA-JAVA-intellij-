/*Queestion:
Given an array nums of integers, return how many of them contain an even number of digits.
 */

/*Solution*/


class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
            for(int num: nums){
                int ncount = 0;
                while(num>0){
                    num/= 10;
                    ncount++;
                }
                if(ncount%2 == 0){
                    count++;
                }
            }
    return count;
    }
}
