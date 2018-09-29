public class MergeSort {
    /**
     * Given an array of integers, sort the elements in the array in ascending order. The merge sort algorithm should be used to solve this problem.
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

    public int[] mergeSort(int[] array) {
        mergeSortHelper(array, new int[array.length], 0, array.length - 1);
        return array;
    }

    private void mergeSortHelper (int[] array, int[] helper, int start, int end) {
        if (start >= end) return;
        int mid = start + ( end - start)/2;
        mergeSortHelper(array, helper, start, mid);
        mergeSortHelper(array, helper, mid + 1, end);
        int i = start; int j = mid + 1;
        int helperIndex = start;
        while (i <= mid || j <= end) {
            int left = i <= mid ? array[i] : Integer.MAX_VALUE;
            int right = j <= end? array[j] : Integer.MAX_VALUE;
            if (left < right) {
                helper[helperIndex] = left;
                i++;
            }else {
                helper[helperIndex] = right;
                j++;
            }
            helperIndex++;
        }
        for (int a = start; a <= end; a++){
            array[a] = helper[a];
        }
    }
}
