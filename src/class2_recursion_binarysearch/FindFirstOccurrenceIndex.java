package class2_recursion_binarysearch;

/**
 * Description
 *  Medium
 *  Array
 *  Binary Search
 * Given a target integer T and an integer array A sorted in ascending order,
 * find the index of the first occurrence of T in A or return -1 if there is no such index.
 *
 * Assumptions
 *
 * There can be duplicate elements in the array.
 * Examples
 *
 * A = {1, 2, 3}, T = 2, return 1
 * A = {1, 2, 3}, T = 4, return -1
 * A = {1, 2, 2, 2, 3}, T = 2, return 1
 * Corner Cases
 *
 * What if A is null or A of zero length? We should return -1 in this case.
 */
/*
return the index of the first occurrence of an element
找出第一个5的index
       L          mid          R
index  0  1  2  3  4  5  6  7  8
A[9]   1  3  5  5  5  5  5  5  5

思路：
1.设置第一个数和最后一个数分别为 left 和 right
2.找到中间值mid，比较mid 和 target 5的大小
3.不断缩小成1/2的范围

时间复杂度&空间复杂度
while loop时间复杂度是1，recursion压栈上一层还在，层数logn，Time：logn，Space是(每层node加一起 1/2n + 1/4n+ 1/8n...) = O（n）
时间复杂度（一共计算多少次层数*每一层做了多少次运算） 一共有logn层 每层是1， 所以Time = O（logn）
 */


/*
        为什么while的条件是left < right - 1：
        left 和 right 要保证 left永远在right的左边（所以 left < right)，并且
        最后要剩下两个数(所以left < right - 1)
        <=的情况是要找具体target数的时候
        这个题 找到的target不一定是第一个出现的数，而左边第一个数也有可能是target
        所以要一直缩小右边的范围，直到找到两个相邻的数
        在这个例子中，最后剩下3 5 或者 5 5 的情况，返回等于target的index

         为什么是(r - 1):之后代码 r = mid 或者 l = mid的时候，
         进行新一轮 while loop
         比如 l = 3； r = 4
         仍然满足l < r
         新 mid = l + （r - l )/2
         mid = 3 +1/2 = 3
         与l重合了 就剩不下两个数了 或者right跑到了left的左边
          */
public class FindFirstOccurrenceIndex {
    public int firstOccur(int[] array, int target) {
        if (array == null || array.length == 0) return -1;
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] >= target) right = mid;//不要停 继续向左check。与找最右边target不同：找最左边target的时候把找到的target作为最右边的点
            else {
                left = mid + 1; // mid ！= target，所以下次计算直接从下一位开始。这样写code整洁 clean。
            }
        }
        //在这个例子中，最后剩下3 5 或者 5 5 的情况，先检查left 再检查right，返回等于target的index。再者如果左右都不是 就返回-1
        if (array[left] == target) return left;
        return array[right] == target ? right : -1;
    }
}
