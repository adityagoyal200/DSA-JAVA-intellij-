/*Question:
You are given a string num, representing a large integer.
Return the largest-valued odd integer (as a string) that is a non-empty substring of num,
or an empty string "" if no odd integer exists.
A substring is a contiguous sequence of characters within a string.
 */

/*Solution*/


class Solution {
    public String largestOddNumber(String num) {
        String str ="";
        int len = num.length();
            for(int i= len-1;i>=0;i--){
                int no = num.charAt(i);
                    if(no%2 != 0){
                        str = num.substring(0,i+1);
                        break;
                    }
            }
    return str;
    }
}
 
