package class2_recursion_binarysearch;
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

    void func1(int a) {
        System.out.print(a);
    }

    void func2(int b) {
        func1(10);

    }


}
