package com.futao.stack;

/**
 * 栈的接口定义
 *
 * @author futao
 * Created on 2020/4/20.
 */
public interface Stack<E> {
    /**
     * 将元素添加到栈中
     *
     * @param e
     */
    void push(E e);

    /**
     * 将栈顶元素推出
     *
     * @return
     */
    E pop();

    /**
     * 判断栈是否是空的
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 返回栈顶元素
     *
     * @return
     */
    E peek();

    /**
     * 返回栈中元素的个数
     *
     * @return
     */
    int getSize();
}
