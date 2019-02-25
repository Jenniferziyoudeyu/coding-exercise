package class4_binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalPractise {
    public List<Integer> leverOrderTraversal2(TreeNode root) {
        if (root == null) return null;
        //返回一个list 先定义它。arrayList便于查找和删除，linkedList便于add
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        //向queue里push root
        queue.offer(root);
        //queue为空的时候 整个遍历结束
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
            list.add(cur.value);
        }
        return list;
    }


    //需要返回的是一个array的array，这个array长度不定 所以用list
    public List<List<Integer>> leverOrderTraversal(TreeNode root) {
        if (root == null) return null;
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            //下面这一步是关键
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                TreeNode cur = queue.poll();
                list.add(cur.value);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}

