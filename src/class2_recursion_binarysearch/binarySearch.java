package class2_recursion_binarysearch;
/**
 * Description
 * Given a target integer T and an integer array A sorted in ascending order, find the index i such that A[i] == T or return -1 if there is no such index.
 *
 * Assumptions
 *
 * There can be duplicate elements in the array, and you can return any of the indices i such that A[i] == T.
 * Examples
 *
 * A = {1, 2, 3, 4, 5}, T = 3, return 2
 * A = {1, 2, 3, 4, 5}, T = 6, return -1
 * A = {1, 2, 2, 2, 3, 4}, T = 2, return 1 or 2 or 3
 * Corner Cases
 *
 * What if A is null or A is of zero length? We should return -1 in this case.
 */
/*
return any target element's index
比如target是7， 一个数组里有三个7，return任意一个7的index

 要点：
 while进不进得去 和 出不出得来
 */
public class binarySearch {
    public int binary_search(int[] a, int target) {
        //corner case
        if (a == null || a.length == 0) return -1;
        int left = 0;
        int right = a.length - 1;
        //要写<= 因为就一个数的时候，left = right 要进的来while loop
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                left = mid + 1; //要向右移一位，不然如果mid = 0， left = 0，永远小于target 就死循环了
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int findTheClosestElementToTarget(int[] array, int left, int right, int target){
        int mid;
        //left = right - 1 的时候 是两个相邻的数，就停下来。target在两个数字之间 <的时候说明两个数之间还有数 不相邻
        while (left < right - 1) {
            mid = left + (right - left)/2;
            if (array[mid] == target) return mid;
            else if (array[mid] > target){
                right = mid;
            } else {
                left = mid;
            }
        }
        //post processing 找哪个index离target更近 Math.abs 是绝对值的方法
        if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)) {
            return left;
        } else {
            return right;
        }
    }

}
