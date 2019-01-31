package testAndPractice;

/*

Reverse a singly-linked list.

Examples

L = null, return null
L = 1 -> null, return 1 -> null
L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null
 */

import public_class.ListNode;

public class LinkedListReverse {
//    public ListNode reverse(ListNode head) {
//        if (head == null) return null;
//        ListNode pre = null;
//        ListNode res = head;
//        while (head.next != null) {
//            ListNode next = head.next;
//            next.next = head;
//            head.next = pre;
//            next = head;
//            pre = next;
//        }
//        return head;
//    }

//    public ListNode reverse(ListNode head) {
//        if (head == null) return null;
//        ListNode pre = null;
//        ListNode res = head;
//        while (head.next != null) {
//            ListNode next = head.next;
//            next.next = head;
//            head.next = pre;
//            next = head;
//            pre = next;
//        }
//        return head;
//    }

    public ListNode reverse(ListNode head) {
        if (head == null) return null;
        ListNode pre = null; //总共需要三个变量，pre， head， next
        while (head != null) {
            ListNode next = head.next; //1. 头不要丢，确定next是新的头
            head.next = pre;          //2. 反转pre和head之间的指针方向：pre -> head -> next -->: pre <- head  next
            pre = head;              //3. pre,head,next分别向右移动一位
            head = next;
        }                           //while loop走完是head == null了，此时链表的最后一位时head的下一位 就是pre
        return pre;                 //head == null，此时链表的最后一位时head的下一位 就是pre 头节点是pre
    }


}
