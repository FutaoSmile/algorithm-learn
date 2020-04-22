package com.futao.queue;


import com.futao.algorithm.Array;

/**
 * @author futao
 * @date 2020/4/21.
 */
public class ArrayQueue<E> implements Queue<E> {

    private Array<E> data;

    public ArrayQueue(int capacity) {
        this.data = new Array<>(capacity);
    }

    public ArrayQueue() {
        this.data = new Array<>();
    }

    @Override
    public void enqueue(E e) {
        data.addLast(e);
    }

    @Override
    public E dequeue() {
        return data.rmFirst();
    }

    @Override
    public E getFront() {
        return data.getFirst();
    }

    @Override
    public int getSize() {
        return data.getSize();
    }


    /**
     * 13123
     */
    int i, j;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("ArrayQueue. front [");
        for (int i = 0; i < data.getSize(); i++) {
            E e = data.get(i);
            sb.append(e);
            if (i < data.getSize() - 1) {
                sb.append(", ");
            }
        }
        sb.append("] tail");
        return sb.toString();
    }
}
