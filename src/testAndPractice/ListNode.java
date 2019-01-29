package testAndPractice;

public class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}

class insert {
    ListNode insert(ListNode head, int value) {
        if (head == null) return new ListNode(value);
        ListNode pre = null;
        ListNode res = head;
        while (head != null && head.value < value) {
            pre = head;
            head = head.next;
        }
        ListNode insertNode = new ListNode(value);
        if (pre == null) {
            insertNode.next = head;
            return  insertNode;
        }
        pre.next = insertNode;
        insertNode.next = head;
        return res;
    }
}
