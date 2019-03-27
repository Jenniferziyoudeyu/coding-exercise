package testAndPractice.AlgorithmPractice;

public class SelectionSort {
    public int[] selectionSort(int[] array) {
        if (array == null || array.length == 0) return null;
        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = i;
            for (int j = i; j< array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
               }
            }
            swap(array, i, minIndex);
        }
        return array;

    }
    void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
