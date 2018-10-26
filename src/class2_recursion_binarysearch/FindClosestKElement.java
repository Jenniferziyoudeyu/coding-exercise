package class2_recursion_binarysearch;
/**
 * Description
 * Given a target integer T, a non-negative integer K and an integer array A sorted in ascending order, find the K closest numbers to T in A.
 *
 * Assumptions
 *
 * A is not null
 * K is guranteed to be >= 0 and K is guranteed to be <= A.length
 * Return
 *
 * A size K integer array containing the K closest numbers(not indices) in A, sorted in ascending order by the difference between the number and T.
 * Examples
 *
 * A = {1, 2, 3}, T = 2, K = 3, return {2, 1, 3} or {2, 3, 1}
 * A = {1, 4, 6, 8}, T = 3, K = 3, return {4, 1, 6}
 */

/*
how to find closest k element in the array that is closest to a tartget number
找数组里k个离target最近的数字
step 1 先找到离target最近的两个数 find the 1st closest element
step 2 此时数组分成两部分，找到k个离target最近的即可
Target == 4          L=2 R=3 (target在3和7之间）

         Index    0 1 2 3 4
e.g.  int a[5] = {1,2,3,7,9}


 */
public class FindClosestKElement {

    public int[] findClosetKelement (int[] array, int target , int k) {
        if (array == null || array.length == 0) return new int[]{};
        int left = 0, right = array.length - 1;
        //while loop先判断再执行。left与right相邻的时候 还会进行while loop，loop完left与right就会交叉 所以要 l < r - 1
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= target) {
                left = mid;
            } else if (array[mid] > target) {
                right = mid;
            }
        }
        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            //先考虑corner case，左边越界或者右边越界的时候
            if (left < 0 && right < array.length) {
                res[i] = array[right++];
            } else if (right >= array.length && left >= 0) {
                res[i] = array[left--];
            }else if (Math.abs(array[left] - target) < Math.abs(array[right] - target)) {
                res[i] = array[left--];
            } else {
                res[i] = array[right++];
            }

        }
        return res;

    }



}
