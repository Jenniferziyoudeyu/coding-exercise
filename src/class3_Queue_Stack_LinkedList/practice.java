package class3_Queue_Stack_LinkedList;

public class practice {
    public int aPowOfB (int a, int b) {
        if (b == 0) return 1;
        int temp = aPowOfB(a, b/2);
        if (b % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * a;
        }
    }

    private void triangel (int x) {
        for (int i = 0 ; i < x; i++) {
            for (int j = 0; j < i; j++){
                System.out.println();
            }
        }
    }

    public int binarySearch(int[] arr, int target) {
        if (arr == null) return -1;
        int left = 0; int right = arr.length - 1; //array.length == 0的时候，left为0， right = —1
        //不满足while情况 不执行while内容 直接返回-1 所以上一句不需要写 array.length == 0的corner case
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (target == mid) return mid;
            else if (target < mid) right = mid - 1;
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
