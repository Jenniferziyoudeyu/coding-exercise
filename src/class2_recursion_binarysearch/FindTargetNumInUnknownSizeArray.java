package class2_recursion_binarysearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * Given a integer dictionary A of unknown size, where the numbers in the dictionary are sorted in ascending order, determine if a given target integer T is in the dictionary. Return the index of T in A, return -1 if T is not in A.
 *
 * Assumptions
 *
 * dictionary A is not null
 * dictionary.get(i) will return null(Java)/INT_MIN(C++)/None(Python) if index i is out of bounds
 * Examples
 *
 * A = {1, 2, 5, 9, ......}, T = 5, return 2
 * A = {1, 2, 5, 9, 12, ......}, T = 7, return -1
 *
 */
/*
Given a sorted dictionary with unknown size, how to determine whether a word is in this dictionary or not
在没有右边界的数组里找有没有target

step 1：确定右边界 right 从1开始不断乘以2
step 2： keep doing right = right * 2 until either
         case (1)(input[right] == NULL. which means the right index is out of the range of the dictionary
         case (2)(input[right] >= target. which means we only need to look back from 0 to right to find the target
                 上一步还没找到target 所以左边界 [left = right/2, right = right]
step 3：Run binary search

Follow up question:
what if you jump like this: right = right * 10;
which way is better: right * 2? right * 10?
2的好处是最后一步 不会溢出太多
10的好处 收回快 每次收回十倍

Time of 2 times
jump out Time = log_2(n);
n个数的数组，最多跳到到接近2倍n的地方 所以最大跳到的数 <2n;
jump in 折半查找
Time = log_2(2n);

Time of 10 times
jump out Time = log_10(n);
n个数的数组，最多跳到到接近10倍n的地方 所以最大跳到的数 <10n;
jump in 查找 binary search 也是折半查找
Time = log_2(10n);
 */

public class FindTargetNumInUnknownSizeArray {

    public int search(Dictionary dict, int target) {
        if (dict == null) return -1;
        int left = 0; int right = 1;
        while (target > dict.get(right)) {  //两个数字的比较
            left = right;
            right *= 2;
        }
        while (left <= right) {            //确定了target所在的范围，比较角标。
            int mid = left + (right - left)/2;
            if (target == dict.get(mid)) return mid;
            else if (target > dict.get(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

interface Dictionary {
    public Integer get(int index); // 模仿一个没有边界的array。
}
