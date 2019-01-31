package class3_Queue_Stack_LinkedList;

import public_class.ListNode;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListNodeReverse {
    public ListNode reverse1(ListNode head) {
        if (head == null) return null;
        public_class.ListNode pre = null; //总共需要三个变量，pre， head， next
        while (head != null) {
            public_class.ListNode next = head.next; //1. 头不要丢，确定next是新的头
            head.next = pre;          //2. 反转pre和head之间的指针方向：pre -> head -> next -->: pre <- head  next
            pre = head;              //3. pre,head,next分别向右移动一位
            head = next;
        }                           //while loop走完是head == null了，此时链表的最后一位时head的下一位 就是pre
        return pre;                 //head == null，此时链表的最后一位时head的下一位 就是pre 头节点是pre
    }





    // recursion方法
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

}

