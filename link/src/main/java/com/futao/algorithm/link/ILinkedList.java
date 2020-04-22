package com.futao.algorithm.link;

import sun.jvm.hotspot.debugger.SymbolLookup;

/**
 * @author futao
 * @date 2020/4/22
 */
public interface ILinkedList<E> {

    void add(E e, int index);

    void addFirst(E e);

    void addLast(E e);

    E rmAt(int index);

    E rmFirst();

    E rmLast();

    boolean contains(E e);

    boolean isEmpty();

    E get(int index);

    E getFirst();

    E getLast();

    void set(E e, int index);

    int getSize();


    @Override
    String toString();
}
