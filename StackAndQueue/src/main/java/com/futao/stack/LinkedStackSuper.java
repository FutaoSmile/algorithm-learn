package com.futao.stack;

import com.futao.algorithm.link.ILinkedList;
import com.futao.algorithm.link.LinkedList;
import com.futao.algorithm.link.LinkedListSuper;

/**
 * @author futao
 * @date 2020/4/22
 */
public class LinkedStackSuper<E> implements Stack<E> {

    private ILinkedList<E> linkedList;

    public LinkedStackSuper() {
        this.linkedList = new LinkedListSuper<>();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.rmFirst();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("top [");
        for (int i = 0; i < linkedList.getSize(); i++) {
            E e = linkedList.get(i);
            buffer.append(e);
            if (i != linkedList.getSize() - 1) {
                buffer.append(", ");
            }
        }
        buffer.append("] ");
        return buffer.toString();
    }
}
