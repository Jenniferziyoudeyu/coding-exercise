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


    public int[] kSmallestPQ(int[] array, int k) {
        if (array == null || k > array.length || k <= 0) return new int[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(10,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for (int i = 0; i < array.length; i++) {
            pq.add(array[i]);
        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = pq.poll();
        }
        return result;

    }

}
