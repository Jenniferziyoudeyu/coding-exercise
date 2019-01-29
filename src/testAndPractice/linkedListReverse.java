package testAndPractice;
/*

Reverse a singly-linked list.

Examples

L = null, return null
L = 1 -> null, return 1 -> null
L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null
 */

public class linkedListReverse {
    public ListNode reverse(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode res = head;
        while (head.next != null) {
            head = head.next;
            pre = head.next;
            head.next = pre;
            
        }
    }

}
