/*Question:
Given two string arrays word1 and word2, return true if the two arrays
represent the same string,and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.
 */

/*Solution*/


class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n=word1.length;
        int m=word2.length;
        String wrd1="";
        String wrd2="";
            for(int i=0;i<n;i++){
                wrd1 = wrd1+word1[i];
            }
            for(int i=0;i<m;i++){
                wrd2 = wrd2+word2[i];
            }
            if(wrd1.equals(wrd2)){
                return true;
            }
    return false;
    }
}
