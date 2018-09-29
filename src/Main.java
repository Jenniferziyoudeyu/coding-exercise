public class Main {

    public static void main(String[] args) {
//        int[] array = {5,3,7,1,8,2};

//        SelectionSort textCase = new SelectionSort();
//        int[] thisIsReturnValue = textCase.solve(array);
//        for (int i = 0; i < thisIsReturnValue.length; i++) {
//            System.out.print(thisIsReturnValue[i] + ",");
//        }
//        QuickSort testQuickSort = new QuickSort();
  //      int[] Qsarray = {3,5,2,7,8,0,1};
    //    int[] returnValue = testQuickSort.quickSort(Qsarray);
//        for(int i = 0; i < returnValue.length; i++) {
 //        System.out.print(returnValue[i] + ",");
//        }
    //    }

        MergeSort testMergeSort = new MergeSort();
        int[] mergeSortArray = {5,3,7,1,8,2};
        int[] mergeSortReturnValue = testMergeSort.mergeSort(mergeSortArray);
        for (int j = 0; j < mergeSortReturnValue.length; j++) {
            System.out.print(mergeSortArray[j] + ",");
        }


//        int num1 = 1, num2 = 1;
//        int addResult = add(num1, num2);
//        System.out.print(addResult);这样才返回result：2
//    }

//    static int add(int a, int b) {
//        return a + b;
    }

}

