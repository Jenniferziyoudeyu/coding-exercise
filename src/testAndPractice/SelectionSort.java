package testAndPractice;

public class SelectionSort {
    int[] selectionSort(int[] array) {
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
            int temp = min;
            min = array[i];
            array[i] = temp;
        }
        return array;

    }
}
