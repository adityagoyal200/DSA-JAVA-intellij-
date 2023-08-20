/*Question:
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
Each of the words consists of only uppercase and lowercase English letters (no punctuation).
For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s and an integer k.
You want to truncate s such that it contains only the first k words. Return s after truncating it.
 */
/*Solution*/
class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();
        int i =0;
        int count=0;
            while(i<n){
                if(s.charAt(i) ==' '){
                    count++;
                }
                if(count==k){
                    return s.substring(0,i);
                }
                i++;
            }
     return s;
    }
}
