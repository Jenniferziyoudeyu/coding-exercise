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
    //iteration 从左往右操作
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
//recursion 触底反弹 从右向左操作
    public ListNode reverse2(ListNode head) {
        //代码顺序 1-> (2->3->2->3）循环到最后一位数字 ->（4->上一层3->4->上一层3）->5->6
        //1.head == null是整个代码的corner case. head.next == null保证head是最后一位数
        if (head == null || head.next == null) return head;
        //2
        ListNode next = head.next;
        //3  2->3循环 一直指到最后一位数
        ListNode newHead = reverse2(next);
        //4  2->3循环完 开始反转：3->4循环 next的下一位指向上一层的head，也就是next的前一个数
        next.next = head;
        //5 避免1->2 和 2->1 同时存在。所以让1的next是null
        head.next = null;
        //6
        return newHead;
    }
}
