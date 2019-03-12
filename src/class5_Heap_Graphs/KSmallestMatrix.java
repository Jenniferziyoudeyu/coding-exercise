//package class5_Heap_Graphs;
//
//import class1_array_sort.Array;
//
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//public class KSmallestMatrix {
//    public int[] kSmallestMatrix(int[][] matrix, int k) {
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0
//                || k <= 0 || matrix.length * matrix[0].length < k) return null;
//
//        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return matrix[o2[0]][o2[1]] - matrix[o1[0]][o1[1]];
//            }
//        });
//        int row = matrix.length, col = matrix[0].length;
//        boolean[][] visited = new boolean[row][col];
//        //在堆上要初始化一下 new int[]。。。
//        pq.offer(new int[]{0, 0});
//        visited[0][0] = true;
//        int[] result = new int[k];
//        int index = 0;
//        //如果找第一个最小的数 直接返回matrix[0][0] 所以 k != 1
//        while (!pq.isEmpty() && k > 0) {
//            int[] poll = pq.poll();
//            int x = poll[0], y = poll[1];
//            result[index] = matrix[x][y];
//
//            //先判断下一个点是否有效
//            if (x + 1 < row && !visited[x + 1][y]) {
//                pq.offer(new int[]{x + 1, y});
//                visited[x + 1][y] = true;
//            }
//            if (y + 1 < col && !visited[x][y + 1]) {
//                pq.offer(new int[]{x, y + 1});
//                visited[x][y + 1] = true;
//            }
//            index++;
//            k--;
//        }
//
//
//        //返回值应该是k smallest的数的数组
//        //pq.peek()是最小值的坐标
//        return result;
//    }
//}
