import class1_sort.MergeSort;
import class2_recursion_binarysearch.FindClosestKElement;
import class2_recursion_binarysearch.FindFirstOccurrenceIndex;

public class Main {

    public static void main(String[] args) {
//        int[] array = {5,3,7,1,8,2};

//        class1_sort.SelectionSort textCase = new class1_sort.SelectionSort();
//        int[] thisIsReturnValue = textCase.solve(array);
//        for (int i = 0; i < thisIsReturnValue.length; i++) {
//            System.out.print(thisIsReturnValue[i] + ",");
//        }
//        class1_sort.QuickSort testQuickSort = new class1_sort.QuickSort();
  //      int[] Qsarray = {3,5,2,7,8,0,1};
    //    int[] returnValue = testQuickSort.quickSort(Qsarray);
//        for(int i = 0; i < returnValue.length; i++) {
 //        System.out.print(returnValue[i] + ",");
//        }
    //    }

//        MergeSort testMergeSort = new MergeSort();
//        int[] mergeSortArray = {5,3,7,1,8,2};
//        int[] mergeSortReturnValue = testMergeSort.mergeSort(mergeSortArray);
//        for (int j = 0; j < mergeSortReturnValue.length; j++) {
//            System.out.print(mergeSortArray[j] + ",");
//        }

//        FindClosestKElement closestKElement = new FindClosestKElement();
//        int[] kArray = {1,4,4,5,5,6,6,6,6,7,7,9};
//        int count = 5;
//        int[] kClosestElement = closestKElement.findClosetKelement(kArray,7,count);
//        for (int i = 0; i < kClosestElement.length; i++) {
//            System.out.print(kClosestElement[i] + ",");
//        }

        FindFirstOccurrenceIndex firstOccurrenceIndex = new FindFirstOccurrenceIndex();
        int[] firstOccurArray = {1,2,4,5,6,6,6,6,6,7};
        int firstOccurIndex = firstOccurrenceIndex.findFirstIndex(firstOccurArray,6);
        System.out.println(firstOccurIndex);



//        int num1 = 1, num2 = 1;
//        int addResult = add(num1, num2);
//        System.out.print(addResult);这样才返回result：2
//    }

//    static int add(int a, int b) {
//        return a + b;
    }

}

