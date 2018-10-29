package class3_Queue_Stack_LinkedList;

/**
 *
 Description
 Check if a given linked list has a cycle. Return true if it does, otherwise return false.
 */

public class CheckIfLinkedListHasACycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null && fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (slow == fast) return true;
        else return false;
    }
}
