package Stack;

import java.util.Stack;

public class ImplementQueueUsingStack {
    Stack<Integer> stackin = new Stack();
    Stack<Integer> stackout = new Stack();

    public MyQueue() {

    }

    public void push(int x) {
        if(stackin.isEmpty()){
            stackin.push(x);
            return;
        }

        while (!stackin.isEmpty()){
            stackout.push(stackin.pop());
        }

        stackin.push(x);
        while(!stackout.empty()){
            stackin.push(stackout.pop());
        }
    }

    public int pop() {
        return stackin.pop();
    }

    public int peek() {
        return stackin.peek();
    }

    public boolean empty() {
        return stackin.isEmpty() && stackout.isEmpty();
    }
}

//O(1)
