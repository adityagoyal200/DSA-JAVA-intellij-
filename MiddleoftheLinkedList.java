/*Question:
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
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
    public ListNode middleNode(ListNode head) {
    ListNode num1 = head;
    ListNode num2 = head;
        while(num2!=null && num2.next!=null){
            num1 = num1.next;
            num2 = num2.next.next;
        }
    return num1;
    }
}
