package com.futao.queue;

/**
 * 队列规范
 *
 * @author futao
 * @date 2020/4/21.
 */
public interface Queue<E> {
    /**
     * 入队
     *
     * @param e 元素
     */
    void enqueue(E e);

    /**
     * 出队
     *
     * @return
     */
    E dequeue();

    /**
     * 获取队顶元素
     *
     * @return
     */
    E getFront();

    /**
     * 获取队列中元素个数
     *
     * @return
     */
    int getSize();
}
