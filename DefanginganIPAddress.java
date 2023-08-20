/*Question:
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
 */

/*Solution*/

class Solution {
    public String defangIPaddr(String address) {
        String str="";
        str = address.replace(".","[.]");
    return str;
    }
}
 
