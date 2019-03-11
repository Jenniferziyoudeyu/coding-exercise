package class5_Heap_Graphs;

import javax.xml.soap.Node;
import java.util.*;

public class levelOrderTraverse {
    public List<List<Integer>> leverOrderTraverse (TreeNode root) {
        List<List<Integer>> outList = new ArrayList<>();
        if (root == null) return outList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> innerList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                innerList.add(poll.value);
                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            outList.add(innerList);
        }
        return outList;
    }



    public boolean isCompletTree (TreeNode root) {
        if (root == null) return true;
        boolean lastNodeHasOnlyLeftChildOrNoneChild = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    if(lastNodeHasOnlyLeftChildOrNoneChild) return false;
                    queue.offer(poll.left);
                } else {
                    lastNodeHasOnlyLeftChildOrNoneChild = true;
                }
                if (poll.right != null) {
                    if(lastNodeHasOnlyLeftChildOrNoneChild) return false;
                    queue.offer(poll.right);
                } else {
                    lastNodeHasOnlyLeftChildOrNoneChild = true;
                }
            }
        }
        return true;
    }

    public int kSmallest(int[][]matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        PriorityQueue<cell> queue = new PriorityQueue<>(new Comparator<cell>() {
            @Override
            public int compare(cell o1, cell o2) {
                return o1.value > o2.value ? 1 : -1;
            }
        });
        boolean[][] valid = new boolean[m][n];
        queue.offer(new cell(0,0,matrix[0][0]));
        valid[0][0] = true;
        for (int i = 0; i < k - 1; i++) {
            cell poll = queue.poll();
            if (poll.row + 1 < m && !valid[poll.row + 1][poll.col]) {
                queue.offer(new cell(poll.row + 1, poll.col, matrix[poll.row + 1][poll.col]));
                valid[poll.row + 1][poll.col] = true;
            }
            if (poll.col + 1 < n && !valid[poll.row + 1][poll.col]) {
                queue.offer(new cell(poll.row, poll.col + 1, matrix[poll.row][poll.col + 1]));
                valid[poll.row][poll.col + 1] = true;
            }
        }
        return queue.isEmpty() ? 0 : queue.peek().value;

    }

    private class cell {
        int value;
        int row;
        int col;
        cell(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.value = val;
        }

    }















class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value) {
        this.value = value;
    }
}


}