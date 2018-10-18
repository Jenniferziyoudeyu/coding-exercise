package class3_Queue_Stack_LinkedList;

import javax.xml.soap.Node;
import java.util.List;

public class ListNodeReverse {
    //recursion 方法
    public Node ReverseList (ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        if(head != null && head.next != null && head.next.next == null) {
            head.next.next = head;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode (int val) {
        this.val = val;
    }
}
