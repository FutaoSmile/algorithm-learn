package com.futao.algorithm.link;

/**
 * 实现链表
 * 虚拟头结点
 *
 * @author futao
 * @date 2020/4/22
 */
public class LinkedListSuper<E> implements ILinkedList<E> {

    /**
     * 元素个数
     */
    private int size;

    /**
     * 虚拟头结点
     */
    private Node dummyHead;

    public LinkedListSuper() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    @Override
    public void add(E e, int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("不可用的`索引`位置");
        }
        Node currentNode = dummyHead;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(e, currentNode.next);
        size++;
    }

    @Override
    public void addFirst(E e) {
        add(e, 0);
    }

    @Override
    public void addLast(E e) {
        add(e, size);
    }

    @Override
    public E rmAt(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("不可用的`索引`位置");
        }
        Node currentNode = this.dummyHead;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        Node preNode = currentNode;
        Node curNode = currentNode.next;
        Node nextNode = curNode.next;

        preNode.next = nextNode;
        curNode.next = null;

        size--;
        return curNode.element;
    }

    @Override
    public E rmFirst() {
        return rmAt(0);
    }

    @Override
    public E rmLast() {
        return rmAt(size - 1);
    }

    @Override
    public boolean contains(E e) {
        Node cur = this.dummyHead;
        while (cur.next != null) {
            if (cur.next.element.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("不可用的`索引`位置");
        }
        Node cur = this.dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.element;
    }

    @Override
    public E getFirst() {
        return get(0);
    }

    @Override
    public E getLast() {
        return get(size - 1);
    }

    @Override
    public void set(E e, int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("不可用的`索引`位置");
        }
        Node cur = this.dummyHead;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next.element = e;
//
//        Node toInsert = new Node(e);
//
//
//        Node preNode = cur;
//        Node middleNode = cur.next;
//        Node nextNode = middleNode.next;
//
//        preNode.next = toInsert;
//        toInsert.next = nextNode;
//
//        middleNode.next = null;
    }

    @Override
    public int getSize() {
        return size;
    }

    private class Node {
        public E element;
        public Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

        public Node(E element) {
            this.element = element;
        }
    }


    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("LinkedListSuper size=").append(size).append("\t[");
        Node cur = this.dummyHead;
        while (cur.next != null) {
            buffer.append(cur.next.element);
            if (cur.next.next != null) {
                buffer.append(",");
            }
            cur = cur.next;
        }
        buffer.append("]");
        return buffer.toString();
    }
}
