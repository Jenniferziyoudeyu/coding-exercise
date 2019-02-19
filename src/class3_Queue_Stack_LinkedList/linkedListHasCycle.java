package class3_Queue_Stack_LinkedList;

import java.util.*;

/**
 *
 Description
 Check if a given linked list has a cycle. Return true if it does, otherwise return false.
 */

public class linkedListHasCycle {
    public boolean hasCycleList(ListNode head) {
        if (head == null) return false;
        ListNode res = head;
        List<ListNode> list = new ArrayList<>();
        //head != null：前面有路走.list.indexOf(head) != -1:没走过这个node.
        while (head != null) {
            if (list.indexOf(head) != -1) return true;
            list.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleList2(ListNode head) {
//        if (head == null) return false;
        List<ListNode> list = new ArrayList<>();
        //前面有路走并且我没走过这个node.满足这两个条件再进行while loop
        while (head != null && list.indexOf(head) == -1) {
            list.add(head);
            head = head.next;
        }
        return head != null; // return head != null ? true : false;的简写
    }

    public boolean hasCycleMap(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
//        map.put(head, 1);
//        int value = map.get(head);
        while (head != null) {
            if (map.containsKey(head)) return true;
            map.put(head,1);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleSet(ListNode head) {
        Set<ListNode> set = new HashSet<>();
//        set.add(head);        //返回Boolean
//        set.contains(head); //返回Boolean
        while (head != null) {
            //先检查有没有出现过head，有的话返回true，没有的话再添加
            if (set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleSet2(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            //
            if (! set.add(head)) return true;

            head = head.next;
        }
        return false;
    }

    public boolean hasCycleSet3(ListNode head) {
        //有路并且没见过 第二好方法。第一好是快慢指针
        Set<ListNode> set = new HashSet<>();
        while (head != null && set.add(head)) {
            head = head.next;
        }
        return head != null;
    }

//    public boolean hasCycleFastSlow(ListNode head) {
//        if (head == null) return false;
//        ListNode fast = head.next;
//        ListNode slow = head;
//        while (fast != null && fast.next != null && fast != slow) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return fast == slow;
//    }
}
