/*Question:
You are given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position
moves to indices[i] in the shuffled string.
Return the shuffled string.
 */
/*Solution*/
class Solution {
    public String restoreString(String s, int[] indices) {
        int n =indices.length;
        char [] ar= new char[n];
            for(int i=0;i<n;i++){
                ar[indices[i]]=s.charAt(i);
            }
        String str= new String(ar);

    return str;
    }
}
