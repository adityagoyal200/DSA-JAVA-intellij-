/*Question:
Given two positive integers a and b, return the number of common factors of a and b.
An integer x is a common factor of a and b if x divides both a and b.
 */

/*solution*/

class Solution {
    public int commonFactors(int a, int b){
    int comfac = 0;
    int min = 0;
        if(a<b){
            min = a;
        }
        else{
            min = b;
        }
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                comfac++;
            }
        }
    return comfac++;
    }
}
 
