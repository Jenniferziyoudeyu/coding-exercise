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
}
