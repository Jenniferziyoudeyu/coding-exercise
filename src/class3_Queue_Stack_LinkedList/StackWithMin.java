package class3_Queue_Stack_LinkedList;

import java.util.Stack;

public class StackWithMin {
    /**
     * Description
     * Enhance the stack implementation to support min() operation. min() should return the current minimum value in the stack. If the stack is empty, min() should return -1.
     *
     * pop() - remove and return the top element, if the stack is empty, return -1
     *
     * push(int element) - push the element to top
     * top() - return the top element without remove it, if the stack is empty, return -1
     * min() - return the current min value in the stack.
     */
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public StackWithMin() {
      this.stack1 = new Stack<>();
      this.stack2 = new Stack<>();
    }

    public int pop() {
        if (!stack2.isEmpty()) {
            stack2.pop();
        }
        return stack1.isEmpty() ? -1 : stack1.pop();

    }

    public void push(int element) {
        if (stack2.isEmpty()) stack2.push(element);
        else stack2.push(stack2.peek() < element ? stack2.peek() : element);
        stack1.push(element);
    }

    public int top(int elm) {
        return stack1.isEmpty() ? -1 : stack1.peek();
    }

    public int min() {
        return stack2.isEmpty() ? -1 : stack2.peek();
    }
}
