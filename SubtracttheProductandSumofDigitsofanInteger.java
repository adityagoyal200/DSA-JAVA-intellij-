/*Question:
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 */
/*Solution*/
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prd=1;
            while(n!=0){
                int a = n%10;
                n = n/10;
                sum = sum+a;
                prd = prd*a;
            }
    return (prd-sum);
    }
}
