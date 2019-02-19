package class3_Queue_Stack_LinkedList;

import java.util.List;

/**
 *
 Description
 Insert a value in a sorted linked list.

 Examples

 L = null, insert 1, return 1 -> null
 L = 1 -> 3 -> 5 -> null, insert 2, return 1 -> 2 -> 3 -> 5 -> null
 L = 1 -> 3 -> 5 -> null, insert 3, return 1 -> 3 -> 3 -> 5 -> null
 L = 2 -> 3 -> null, insert 1, return 1 -> 2 -> 3 -> null

 */
/*
point找到合适插入位置。是while loop以及以后的 post action
实现point一共分四种情况：
1. list是null，返回insertNode
2. list不是null，insertNode插入到第一个点
3. list不是null，insertNode插入到中间的位置
4. list不是null，insertNode插入到最后的位置

 */
public class InsertInSortedLinkedList {
    public ListNode insert(ListNode head, int value) {
      ListNode dummy = new ListNode(0);
      ListNode pre = dummy;
      dummy.next = head;
      while (head != null && head.value < value) {
          pre = head;
          head = head.next;
      }
      ListNode newNode = new ListNode(value);
      pre.next= newNode;
      newNode.next = head;
      return dummy.next;
    }

}
