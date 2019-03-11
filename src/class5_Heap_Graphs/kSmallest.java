package class5_Heap_Graphs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class kSmallest {
    public int[] kSmallest(int[] array, int k) {
        //
        if (array == null || k > array.length || k <= 0) return new int[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i: array) {
            pq.add(i);
        }
        int[] newArray = new int[k];
        for (int a = 0; a < k; a++) {
            newArray[a] = pq.poll();

        }

        return newArray;
    }


    int[] kSmallestSortArray(int[] array, int k) {
        if (array == null || array.length < k || k <= 0) return new int[0];
        Arrays.sort(array);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = array[i];
        }
        return result;
    }

    /*
    要点：
    1. 找k smallest需要最大堆，这样在最上面poll出来的才是pq里面最大的数
    2. k到array.length之间的数需要与pq.poll()作比较，不断把在pq外面更小的数换到pq里面去
    3. 注意：传到result里面 需要按从小到大排列，而pq每次poll出来都是pq中的最大值，所以for loop要从result.length - 1开始
     */

    public int[] kSmallestPQ(int[] array, int k) {
        if (array == null || k > array.length || k <= 0) return new int[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //找最大堆
                return o2 - o1;
            }
        });
        //0-k之间 先向pq添加k个数
        for (int i = 0; i < k; i++) {
            pq.offer(array[i]);
        }
        //k-array.length之间需要比较一下，不断把pq变成array里面最小的k个数的集合
        for (int i = k; i < array.length; i++) {
            if (pq.peek() > array[i]) {
                pq.poll();
                pq.offer(array[i]);
            }
        }
        int[] result = new int[k];
        //按升序排列，result.length - 1是第一个数
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = pq.poll();
        }
        return result;

    }

}
