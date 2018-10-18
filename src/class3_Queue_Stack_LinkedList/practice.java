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
}
