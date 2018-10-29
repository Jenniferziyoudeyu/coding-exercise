package class3_Queue_Stack_LinkedList;

/**
 * N1—> N2—>N3—>N4—>N5。。。—>Nn—>NULL
 * convert to：（N1—> Nn）—>（N2—> Nn-1）—>（N3—> Nn-3）—>。。。。
 *
 * N1指向倒数第一个，N2指向倒数第二个 以此类推..
 */

public class N1PointToNn {
    public ListNode firstPointToLast (ListNode head) {
        //corner case
        if (head == null) return head;
        //保存头结点，前部分head（dummy）要向后移动，所以设置res停在最初位置
        ListNode dummy = new ListNode(0),
                res = dummy;
        ListNode dummy2 = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        dummy2.next = slow;
        slow.next = null;
        //reverse
        ListNode pre = dummy2;
        ListNode reverseHead = dummy2.next;
        while (reverseHead.next != null) {
            ListNode next = reverseHead.next;
            reverseHead.next = pre;
            reverseHead = next;
            pre = reverseHead;
        }

        while (dummy != null && reverseHead != null) {
            res.next = dummy;
            dummy = dummy.next;
            res = res.next;
            res.next = reverseHead;
            reverseHead = reverseHead.next;
            res = res.next;
        }
        if (dummy != null) res.next = dummy;
        if (reverseHead != null) res.next = reverseHead;
        return res.next;

    }
}
