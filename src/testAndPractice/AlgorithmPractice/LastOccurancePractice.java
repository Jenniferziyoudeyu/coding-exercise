package testAndPractice.AlgorithmPractice;

public class LastOccurancePractice {
    public int lastOccurance(int[] array, int target) {
        if (array == null || array.length == 0) return -1;
        int left = 0, right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= target) left = mid;
            if (array[mid] > target) right = mid - 1;
        }
        if (array[right] == target) return right;
        else if (array[left] == target) return left;
        else return -1;
    }
}
