package class5_Heap_Graphs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0
                || k <= 0 || matrix.length * matrix[0].length < k) return -1;

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            //o1 - o2是最小堆
            public int compare(int[] o1, int[] o2) {
                return matrix[o1[0]][o1[1]] - matrix[o2[0]][o2[1]];
            }
        });
        int row = matrix.length, col = matrix[0].length;
        boolean[][] visited = new boolean[row][col];
        //在堆上要初始化一下 new int[]。。。
        pq.offer(new int[]{0, 0});
        visited[0][0] = true;
        //如果找第一个最小的数 直接返回matrix[0][0] 所以 k != 1

        while (!pq.isEmpty() && k > 1) {
            int[] poll = pq.poll();
            int x = poll[0], y = poll[1];

            //先判断下一个点是否有效
            if (x + 1 < row && !visited[x + 1][y]) {
                pq.offer(new int[]{x + 1, y});
                visited[x + 1][y] = true;
            }
            if (y + 1 < col && !visited[x][y + 1]) {
                pq.offer(new int[]{x, y + 1});
                visited[x][y + 1] = true;
            }
            k--;
        }


        //返回值应该是k smallest的数的数组
        //pq.peek()是最小值的坐标，e.g. peek = {5,2}: pq.peek()[0] = 5, pq.peek()[1] = 2
        //之前的数都不断poll出去 一共k次，所以现在pq.poll是当前pq最小的，是在整个matrix中第k小的
        return matrix[pq.peek()[0]][pq.peek()[1]];


    }

}

/*public class Solution {
  public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        PriorityQueue<cell> queue = new PriorityQueue<>(new Comparator<cell>() {
            @Override
            public int compare(cell o1, cell o2) {
                return o1.value > o2.value ? 1 : -1;
            }
        });
        boolean[][] valid = new boolean[m][n];
        queue.offer(new cell(0, 0, matrix[0][0]));
        valid[0][0] = true;
        for (int i = 0; i < k - 1 && !queue.isEmpty(); i++) {
            cell poll = queue.poll();
            if (poll.row + 1 < m && !valid[poll.row + 1][poll.col]) {
                queue.offer(new cell(poll.row + 1, poll.col, matrix[poll.row + 1][poll.col]));
                valid[poll.row + 1][poll.col] = true;
            }
            if (poll.col + 1 < n && !valid[poll.row][poll.col + 1]) {
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
}


 */
