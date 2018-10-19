package class3_Queue_Stack_LinkedList;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListNodeReverse {
    //recursion 方法
    public ListNode ReverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode prev = null;
        while (head != null) {
            next = head.next; //永远别丢了正方向linkedlist的头
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode newhead = reverse(next);
        next.next = head;
        head.next = null;
        return newhead;

    }

    class ListNode {
        int val;
        ListNode prev;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}

