package class3_Queue_Stack_LinkedList;

import java.util.List;

/**
 * Description
 * Find the middle node of a given linked list.
 *
 * Examples
 *
 * L = null, return null
 * L = 1 -> null, return 1
 * L = 1 -> 2 -> null, return 1
 * L = 1 -> 2 -> 3 -> null, return 2
 * L = 1 -> 2 -> 3 -> 4 -> null, return 2
 *
 */
public class MiddleNodeOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //fast.next.next != null的话，可以求出靠前一个的middle node
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
