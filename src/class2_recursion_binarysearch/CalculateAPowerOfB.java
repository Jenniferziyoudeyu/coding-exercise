package class2_recursion_binarysearch;

/*
时间复杂度
b = n,
b = n - 1,
b = n - 2,
.
.
.
b = 2;
b = 1
Time = O(n)

空间复杂度
一共有b层
每次调用自己一次
Space = O(b）

 */

public class CalculateAPowerOfB {
    public int CalculateAPowerOfB (int a, int b) {
        if (b == 0) return 1; //base case
        /*
                           1
                          /
                         a
                        /
                       a*a
                      /
                    a*a*a
         */
        return CalculateAPowerOfB(a , b - 1);//一直到 b == 0停止，触底反弹，一级一级得到计算结果
        //34行可以分解成35-37行，触底反弹的过程
//        int popupVal =  CalculateAPowerOfB(a , b - 1); // recursion rule 每次调用自己 一直到 b-1 = 0
//        int returnVal =  a * popupVal;
//        return returnVal;
    }
    /*
    解法2
    hint: a^1000 = a^500 * a^500;
    41行不需要知道结果，一直往下执行 触底反弹，进而得到每一行得到的结果
    时间复杂度
    每次分成2部分
    每层n个数 2^b 第b层
    每层n/2个数 2^b/2  第b/2层
    ...
    每层4个数 2^2 第2层
    每层2个数 2^1 第1层
    每层1个数 2^0 第0层
    2^k = n => k = logn
    Time = O(logb);

    空间复杂度
    因为触底反弹 空间复杂度就是左边一条线
    所以就数多少层就行
    Space = O（logb）


     */

    public int aPowB(int a, int b) {
        if (b == 0) return 1;
        int temp = aPowB(a, b/2);
        if (b % 2 ==0) {
            return temp * temp;
        }else {
            return temp * temp * a;
        }
    }

}
