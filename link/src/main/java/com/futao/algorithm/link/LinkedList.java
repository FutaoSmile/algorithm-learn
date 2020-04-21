package com.futao.algorithm.link;

/**
 * @author futao
 * Created on 2020/4/21.
 */
public class LinkedList<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this.e = e;
        }

    }

    private int size;
    private Node head;


    public void addFirst(E e) {
        head = new Node(e, head);
        size++;
    }


    public void addLast(E e) {
        Node cNode = this.head;
        if (cNode == null) {
            addFirst(e);
            return;
        }
        while (true) {
            if (cNode.next == null) {
                size++;
                cNode.next = new Node(e);
                return;
            }
            cNode = cNode.next;
        }

    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new RuntimeException("添加失败，参数错误，超出范围");
        }
        if (index == 0) {
            addFirst(e);
            return;
        }
        Node hNode = head;
        //TODO bug 当index=1会无法插入
        for (int i = 0; i < index - 1; i++) {
            hNode = hNode.next;
            hNode.next = new Node(e, hNode.next);
        }
        size++;
    }


    public E rmLast() {
        Node cNode = this.head;
        //如果链表为空,则返回空
        if (cNode == null) {
            return null;
        }
        //如果链表的首位元素就是最后一位,则直接返回首位元素,并且将首位置为0
        if (cNode.next == null) {
            head = null;
            size--;
            return cNode.e;
        }
        while (true) {
            //如果当前元素的下一个元素的next为空,则说明下一个元素为最后一个元素,需要移除下一个元素,即把当前元素对下一个元素的next引用置为null
            if (cNode.next.next == null) {
                E e = cNode.next.e;
                cNode.next = null;
                size--;
                return e;
            }
            //如果当前元素的下一个元素的next不为空,则下一个元素不是最后一个元素,将当前指针指向下一个元素
            cNode = cNode.next;
        }
    }

    public E rmFirst() {
        Node hNode = this.head;
        if (hNode == null) {
            return null;
        }
        head = hNode.next;
        size--;
        return hNode.e;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("LinkedList head[");
        Node cN = this.head;
        if (cN != null) {
            sb.append(cN.e);
            Node next = cN.next;
            while (next != null) {
                sb.append(",")
                        .append(next.e);
                next = next.next;
            }
        }
        sb.append("] tail");
        return sb.toString();
    }

}
