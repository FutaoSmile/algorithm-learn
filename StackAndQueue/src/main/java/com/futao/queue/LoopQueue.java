package com.futao.queue;

import org.omg.CORBA.Object;

/**
 * 通过循环数组来实现的队列
 *
 * @author futao
 * @date 2020/4/21.
 */
public class LoopQueue<E> implements Queue<E> {

    /**
     * 存放元素的数组
     */
    E[] data;

    /**
     * 队首指针 -> 指向出队位置
     * /
     * 队尾指针 -> 指向入队位置
     */
    int front, tail = 0;

    int size;

    public LoopQueue(int capacity) {
        this.data = (E[]) new Object[capacity + 1];
    }

    public LoopQueue() {
        this(10);
    }

    @Override
    public void enqueue(E e) {
        if (data.length - size == 1) {
            //只有一个空位，需要进行扩容
            E[] es = (E[]) new Object[data.length * 2];
            System.arraycopy(data, 0, es, 0, es.length);
            data = es;
        }
        data[front] = e;
        size++;
    }

    @Override
    public E dequeue() {

        size--;
        return null;
    }

    @Override
    public E getFront() {
        return data[front];
    }

    @Override
    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("LoopQueue [");
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            sb.append(",");
        }
        return sb.toString();
    }
}
