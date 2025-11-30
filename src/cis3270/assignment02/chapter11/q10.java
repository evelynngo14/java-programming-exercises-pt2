package cis3270.assignment02.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack testStack = new MyStack();
        MyStack reverseStack = new MyStack();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            testStack.push(input.nextLine());
        }

        while (!testStack.isEmpty()) {
            Object popElement = testStack.pop();
            reverseStack.push(popElement);
        }

        System.out.println(reverseStack);

    }
}

class MyStack extends ArrayList<Object> {
    MyStack() {
        super();
    }

    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        return remove(size() - 1);
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
