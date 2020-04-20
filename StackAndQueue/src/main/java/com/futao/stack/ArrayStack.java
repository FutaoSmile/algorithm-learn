package com.futao.stack;

import com.futao.algorithm.Array;

/**
 * 基于数组的栈的实现
 *
 * @author futao
 * Created on 2020/4/20.
 */
public class ArrayStack<E> implements Stack<E> {


    private Array<E> data;

    public ArrayStack(int capacity) {
        this.data = new Array<>(capacity);
    }

    public ArrayStack() {
        this.data = new Array<>();
    }

    /**
     * 将元素添加到栈中
     *
     * @param e
     */
    @Override
    public void push(E e) {
        data.addLast(e);
    }

    /**
     * 将栈顶元素推出
     *
     * @return
     */
    @Override
    public E pop() {
        return data.rmLast();
    }

    /**
     * 判断栈是否是空的
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * 返回栈顶元素但是不移除
     *
     * @return
     */
    @Override
    public E peek() {
        return data.getLast();
    }

    /**
     * 返回栈中元素的个数
     *
     * @return
     */
    @Override
    public int getSize() {
        return data.getSize();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for (int i = 0; i < data.getSize(); i++) {
            E e = data.get(i);
            buffer.append(e);
            if (i != data.getSize() - 1) {
                buffer.append(", ");
            }
        }
        buffer.append("] top");
        return buffer.toString();
    }
}
