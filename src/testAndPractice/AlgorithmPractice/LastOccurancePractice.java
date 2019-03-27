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


/*
    public static void main(String[] args) {
        int[] arrayTarget = {5,3,7,1,1,1,8,2};
        int[] arrayTarget1 = {5,3,7,6,9,8,2};

        BinarySearchClassic binarySearchClassic = new BinarySearchClassic();
        int resultBR = binarySearchClassic.binarySearch(arrayTarget, 8);
        System.out.println("resultBR : " + resultBR);

        LastOccurancePractice lastOccurancePractice = new LastOccurancePractice();
        int resultLOP = lastOccurancePractice.lastOccurance(arrayTarget, 1);
        System.out.println("resultLOP: " + resultLOP);

        SelectionSort selectionSort = new SelectionSort();
        int[] resultArray = selectionSort.selectionSort(arrayTarget1);
        for (int result : resultArray) {
            System.out.println("SelectionSort array is : " + result);
        }
 */
