/*Question:
Given an integer n, return any array containing n unique integers such that they add up to 0.
 */

/*Solution*/


class Solution {
    public int[] sumZero(int n) {
        int [] ar =new int [n];
        int sum=0;
            for(int i=0;i<n-1;i++){
                ar[i]=i+1;
                sum+=ar[i];
            }
            ar[n-1]=-sum;
    return ar;
    }
}
