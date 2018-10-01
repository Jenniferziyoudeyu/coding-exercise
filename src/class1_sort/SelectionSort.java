package class1_sort;

public class SelectionSort {
    /**
     * Given an array of integers, sort the elements in the array in ascending order. The selection sort algorithm should be used to solve this problem.
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
     *
     */
    public int[] solve(int[] array) {
        if (array == null) return array;
            //return new int[0];
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            //每次在当前层选好最小值，把最小值挪到当前层的最左端。每层都要进行此操作 所以写在inner loop外，outer loop内
            swap(array, i, minIndex);
        }
        return array;
    }

    private void swap (int[]array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
