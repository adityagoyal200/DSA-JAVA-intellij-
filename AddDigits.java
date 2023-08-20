/* Question: Given an integer num, repeatedly add all its digits until
the resulthas only one digit, and return it.
 */
/*Solution:*/
 class AddDigits {
    public int addDigits(int num) {
    int sum= 0;
        while(num>0){
            int temp = num%10;
            sum+=temp;
            num/=10;
        }
        if(sum/10==0){
            return sum;
        }
        else{
            return addDigits(sum);
        }
    }
}

