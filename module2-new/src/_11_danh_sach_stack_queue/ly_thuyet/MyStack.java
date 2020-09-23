package _11_danh_sach_stack_queue.ly_thuyet;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.get(0));

        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }

}
