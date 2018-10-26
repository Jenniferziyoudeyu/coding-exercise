package class2_recursion_binarysearch;
/**
 * Description
 * Given a target integer T and an integer array A sorted in ascending order, find the index of the last occurrence of T in A or return -1 if there is no such index.
 *
 * Assumptions
 *
 * There can be duplicate elements in the array.
 *
 * Examples
 *
 * A = {1, 2, 3}, T = 2, return 1
 * A = {1, 2, 3}, T = 4, return -1
 * A = {1, 2, 2, 2, 3}, T = 2, return 3
 * Corner Cases
 *
 * What if A is null or A is array of zero length? We should return -1 in this case.
 */
public class FindLastOccurrenceIndex {
    public int findLastTargetIndex (int[] array, int target) {
        int left = 0, right = array.length - 1;
        int mid = left + (right - left) / 2;
        while (left < right - 1) {
            if (array[mid] <= target) {
                left = mid;
            } else if (array[mid] > target) {
                right = mid;
            }
        }
        //与找最左边index不同
        if (array[right] == target) return right;
        if (array[left] == target) return  left;
        return -1;
    }


}
