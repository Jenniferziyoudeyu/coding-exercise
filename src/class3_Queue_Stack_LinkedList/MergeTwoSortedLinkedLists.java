package class3_Queue_Stack_LinkedList;

import java.util.LinkedList;

/**
 * Merge two sorted lists into one large sorted list.
 *
 * Examples
 *
 * L1 = 1 -> 4 -> 6 -> null, L2 = 2 -> 5 -> null, merge L1 and L2 to 1 -> 2 -> 4 -> 5 -> 6 -> null
 * L1 = null, L2 = 1 -> 2 -> null, merge L1 and L2 to 1 -> 2 -> null
 * L1 = null, L2 = null, merge L1 and L2 to null
 */
public class MergeTwoSortedLinkedLists {
    public ListNode merge(ListNode one, ListNode two) {
        if (one == null && two == null) return null;
        else if (one == null) return two;
        else if (two == null) return one;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (one != null && two != null){
            if (one.value < two.value) {
                cur.next = one;
                one = one.next;
            } else {
                cur.next = two;
                two = two.next;
            }
            cur= cur.next;
        }
        //有可能一个list走完了为null，另一个还没走完，把没走完的贴在后面
        if (one != null) cur.next = one;
        if (two != null) cur.next = two;
        return dummy.next;
    }

    public ListNode merge2(ListNode one1, ListNode two) {
        if (one1 == null && two == null) return null;
        else if (one1 == null) return two;
        else if (two == null) return one1;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (one1 != null || two != null){
            int val1 = one1 == null ? Integer.MAX_VALUE : one1.value;
            int val2 = two == null ? Integer.MAX_VALUE : two.value;
            if (val1 <= val2) {
                dummy.next = one1;
                one1 = one1.next;
            } else {
                dummy.next = two;
                two = two.next;
            }
            dummy = dummy.next;
        }
        return dummy.next;
    }

}
