package testAndPractice.AlgorithmPractice;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MinStack() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int input) {
        stack1.push(input);
        if (stack2.isEmpty() || stack2.peek() > input) {
            stack2.push(input);
        }
    }

    public int pop() {
         if (!stack1.isEmpty()) {
            int pop = stack1.pop();
            if (stack2.peek() == pop) {
                stack2.pop();
            }
            return pop;
        }
        return -1;
    }

    public int peek() {
        if (stack1.isEmpty()) return -1;
        return stack1.peek();


    }

    public boolean isEmpty() {
        return stack1.isEmpty() || stack2.isEmpty();

    }
    public int min() {
        if (stack2.isEmpty()) return -1;
        return stack2.peek();

    }
}
