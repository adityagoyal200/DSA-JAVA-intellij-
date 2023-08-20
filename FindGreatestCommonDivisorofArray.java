/*Question:
Given an integer array nums,return the greatest common divisor of the smallest number and largest number in nums.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 */

/*Solution*/

class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0] ;
        int gcd = 1;
            for(int i=1;i<n;i++){
                if(nums[i]<min){
                    min= nums[i];
                }
                if(nums[i]>max){
                    max=nums[i];
                }
            }
            for(int i=1;i<=min;i++){
                if(max%i==0 && min%i==0){
                    gcd = i;
                }
            }
    return gcd;
    }
}
