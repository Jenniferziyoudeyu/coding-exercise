package class3_Queue_Stack_LinkedList;

/**
 * Description
 * Given a linked list and a target value T, partition it such that all nodes less than T are listed before the nodes larger than or equal to target value T. The original relative order of the nodes in each of the two partitions should be preserved.
 *
 * Examples
 *
 * L = 2 -> 4 -> 3 -> 5 -> 1 -> null, T = 3, is partitioned to 2 -> 1 -> 4 -> 3 -> 5 -> null
 */
public class PartitionLinkedList {
    public ListNode partition(ListNode head, int target) {
        if (head == null) return head;
        ListNode dummy = new ListNode(0),
                res = dummy;
        ListNode dummy2 = new ListNode(0),
                dummy2Copy = dummy2;
        while (head != null) {
            if (head.value < target) {
                dummy.next = head;//把后面的赋给前面的
                dummy = dummy.next; //dummy移到下一位
            } else {
                dummy2.next = head;
                dummy2 = dummy2.next;
            }
            head = head.next;
        }
        //3->5->2->1->9->0 target=4  3->2->1->0->5->9->(应该->null)（但不指向null的话就继续循环->0->5->9->...）
        dummy2.next = null; //dummy2的最后一个数要指向null，不然就死循环
        dummy.next = dummy2Copy.next;
        return res.next;
    }
}
