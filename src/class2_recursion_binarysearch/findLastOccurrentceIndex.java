package class2_recursion_binarysearch;

public class findLastOccurrentceIndex {
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
