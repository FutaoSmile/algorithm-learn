package com.futao.queue;

import com.futao.algorithm.link.ILinkedList;
import com.futao.algorithm.link.LinkedListSuper;

/**
 * @author futao
 * @date 2020/4/22
 */
public class LinkedQueue<E> implements Queue<E> {

    private ILinkedList<E> linkedList;

    public LinkedQueue() {
        this.linkedList = new LinkedListSuper<>();
    }

    @Override
    public void enqueue(E e) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
