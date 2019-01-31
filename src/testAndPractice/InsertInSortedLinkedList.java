package testAndPractice;

/*
Insert a value in a sorted linked list.

Examples

L = null, insert 1, return 1 -> null
L = 1 -> 3 -> 5 -> null, insert 2, return 1 -> 2 -> 3 -> 5 -> null
L = 1 -> 3 -> 5 -> null, insert 3, return 1 -> 3 -> 3 -> 5 -> null
L = 2 -> 3 -> null, insert 1, return 1 -> 2 -> 3 -> null
 */

import public_class.ListNode;

public class InsertInSortedLinkedList {

    public ListNode insertInSortedLinkedList(ListNode head, int value) {
        //corner case不需要写。因为没有它
//        if (head == null) return new ListNode(value);
        ListNode res = head;
        ListNode prev = null;
        while (head != null && head.value < value) {
            prev = head;
            head = head.next;
        }
        ListNode insertNode = new ListNode(value);
        if (prev == null) {
            insertNode.next = head;
            return insertNode;
        }
        prev.next = insertNode;
        insertNode.next = head;
        return res;
    }

}


