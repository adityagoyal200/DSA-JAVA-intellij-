/*Question:
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
*/

/*Solution*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public boolean isPalindrome(ListNode head) {
        int num = 0;
        int rev = 0;
        int pal = 1;
        ListNode temp = head;
            while(temp != null) {
                num = num * 10 + temp.val;
                rev = rev + temp.val * pal;
                pal *= 10;
                temp = temp.next;
            }
     return num == rev;
    }
}
