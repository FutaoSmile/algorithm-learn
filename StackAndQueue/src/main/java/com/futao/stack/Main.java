package com.futao.stack;

/**
 * @author futao
 * Created on 2020/4/20.
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(20);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());

    }
}
