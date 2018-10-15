package class2_recursion_binarysearch;
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
 */

public class FindFirstOccurrenceIndex {
    public int findFirstIndex (int[] array, int target){
        if (array == null || array.length == 0) return 0;
        int left = 0;
        int right = array.length - 1;
        //最后要剩下两个数 所以left ！= right;  <=的情况是要找具体target数的时候
        //这个题 找到的target不一定是第一个出现的数，所以要一直找到两个相邻的数
        //在这个例子中，最后剩下3 5 或者 5 5 的情况，返回等于target的index
        /*
         为什么是(r - 1):之后代码 r = mid 或者 l = mid的时候，
         进行新一轮 while loop
         比如 l = 3； r = 4
         仍然满足l < r
         新 mid = l + （r - l )/2
         mid = 3 +1/2 = 3
         与l重合了
          */
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                right = mid; //不要停 继续向左check。与找最右边target不同：找最左边target的时候把找到的target作为最右边的点
            } else if (array[mid] < target) {
                left = mid; //rule out不可能元素的好
                // mid ！= target，所以下次计算直接从下一位开始也可以。所以也可以写成left = mid + 1.
            } else {
                right = mid; //因为 mid ！= target，所以下次计算直接从下一位开始也可以。所以也可以写成left = mid - 1.
            }
            /*
            34-40行也可以写成
            if (array[mid] < target) {
                left = mid;
            } else  {
                right = mid; //有可能这个mid就是想找的target 所以left = mid 而不是 mid - 1.
            }
             */
        }
        //在这个例子中，最后剩下3 5 或者 5 5 的情况，返回等于target的index
        if (array[left] == target) return left;
        if (array[right] == target) return  right;
        return -1;
    }
}
