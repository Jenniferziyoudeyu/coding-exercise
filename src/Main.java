public class Main {

    public static void main(String[] args) {
        SelectionSort textCase = new SelectionSort();
        int[] array = {5,3,7,1,8,2};
        int[] thisIsReturnValue = textCase.solve(array);
        for (int i = 0; i < thisIsReturnValue.length; i++) {
            System.out.print(thisIsReturnValue[i] + ",");
        }

//        int num1 = 1, num2 = 1;
//        int addResult = add(num1, num2);
//        System.out.print(addResult);这样才返回result：2
//    }

//    static int add(int a, int b) {
//        return a + b;
    }

}

