package class3_Queue_Stack_LinkedList;

/**
 * Description
 * Reverse a singly-linked list.
 *
 * Examples
 *
 * L = null, return null
 * L = 1 -> null, return 1 -> null
 * L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null
 */
public class ReverseLinkedList {
    public ListNode reverse(ListNode head) {
        if (head == null) return head;
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
