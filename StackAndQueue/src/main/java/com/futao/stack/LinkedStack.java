package com.futao.stack;

import com.futao.algorithm.link.ILinkedList;
import com.futao.algorithm.link.LinkedListSuper;

/**
 * @author futao
 * @date 2020/4/22
 */
public class LinkedStack<E> implements Stack<E> {

    private ILinkedList<E> linkedList;

    public LinkedStack() {
        this.linkedList = new LinkedListSuper<>();
    }

    @Override
    public void push(E e) {
        linkedList.addLast(e);
    }

    @Override
    public E pop() {
        return linkedList.rmLast();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public E peek() {
        return linkedList.getLast();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }


    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for (int i = 0; i < linkedList.getSize(); i++) {
            E e = linkedList.get(i);
            buffer.append(e);
            if (i != linkedList.getSize() - 1) {
                buffer.append(", ");
            }
        }
        buffer.append("] top");
        return buffer.toString();
    }
}
