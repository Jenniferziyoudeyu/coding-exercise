public class QuickSort {
    /**
     * Given an array of integers, sort the elements in the array in ascending order. The quick sort algorithm should be used to solve this problem.
     *
     * Examples
     *
     * {1} is sorted to {1}
     * {1, 2, 3} is sorted to {1, 2, 3}
     * {3, 2, 1} is sorted to {1, 2, 3}
     * {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
     * Corner Cases
     *
     * What if the given array is null? In this case, we do not need to do anything.
     * What if the given array is of length zero? In this case, we do not need to do anything.
     */
    public int[] quickSort(int[] array) {
        quickSortHelper(array,0, array.length - 1);
        return array;
    }
    private void quickSortHelper (int[] array, int start1, int end1) {
        if (start1 >= end1) return;
        int pivotIndex = findPivotIndex(array,start1,end1);
        quickSortHelper(array, start1,pivotIndex - 1);
        quickSortHelper(array, pivotIndex + 1, end1);

    }

    private int findPivotIndex (int[] array, int start2, int end2) {
        int pivot = array[end2];
        int index = start2;
        for (int i = start2; i < end2; i++) {
            if (array[i] < pivot) {
                swap (array, i, index);
                index++;
            }
        }
        swap(array, end2, index);
        return index;

    }

    private void swap (int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
