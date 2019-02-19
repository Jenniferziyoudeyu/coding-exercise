package class1_sort;

public class BubbleSort {
    void BubbleSort (int array[]) {
        if (array == null || array.length == 0) return;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j+1]) {
                    swap (array, j, j+1);
                }
            }
        }
    }

    public void swap (int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
