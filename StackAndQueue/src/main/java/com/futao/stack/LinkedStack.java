package com.futao.stack;

import com.futao.algorithm.link.ILinkedList;
import com.futao.algorithm.link.LinkedListSuper;

/**
 * 这个类的实现是把LinkedList的尾端作为栈顶，这不是好的实现，因为每次入栈和出栈都是处理LinkedList中最后一个元素，这样的时间复杂度是O(n)
 * 我们应该使用LinkedList的首段作为栈顶，这样每次都是操作LinkedList的首位元素，时间复杂度是O(1);
 * <p>
 * <p>
 * <p>
 * ================================================
 * 数据结构和算法一定要考虑时间复杂度！！！
 * 数据结构和算法一定要考虑时间复杂度！！！
 * 数据结构和算法一定要考虑时间复杂度！！！
 * 数据结构和算法一定要考虑时间复杂度！！！
 * 数据结构和算法一定要考虑时间复杂度！！！
 * 数据结构和算法一定要考虑时间复杂度！！！
 * 数据结构和算法一定要考虑时间复杂度！！！
 * 数据结构和算法一定要考虑时间复杂度！！！
 * ================================================
 *
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
