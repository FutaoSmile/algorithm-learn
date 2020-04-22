package com.futao;

import com.futao.queue.ArrayQueue;
import com.futao.queue.LoopQueue;
import com.futao.queue.Queue;
import com.futao.stack.ArrayStack;
import com.futao.stack.Stack;

/**
 * @author futao
 * Created on 2020/4/20.
 */
public class Main {
    public static void main(String[] args) {
        arrayQueueTest();
    }

    public static void arrayQueueTest() {
        Queue<Integer> queue = new LoopQueue<Integer>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
        }
        queue.dequeue();
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);

        queue.dequeue();

        System.out.println(queue);
        System.out.println(queue.getFront());
        System.out.println(queue.getSize());

    }


    public static void arrayStackTest() {
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
