package class5_Heap_Graphs;

import java.util.LinkedList;
import java.util.Queue;
//一共分四种情况（null， ！null）与 （poll.left, poll.right)两两组合
public class BinaryTree {
    public boolean binaryTree(TreeNode root) {
        if (root == null) return false;
        boolean hasOnlyLeftOrNone = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < queue.size(); i++) {
                TreeNode poll = queue.poll();

                if (poll.left != null) {
                    if (hasOnlyLeftOrNone) return false;
                    queue.offer(poll.left);
                } else {
                    hasOnlyLeftOrNone = true;
                }

                if (poll.right != null) {
                    if (hasOnlyLeftOrNone) return false;
                } else {
                    hasOnlyLeftOrNone = true;
                }
            }
        }
        return true;
    }
}
