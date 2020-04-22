package com.futao.algorithm;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @param <E> 泛型
 * @author futao
 * @date 2020/4/20.
 */
public class Array<E> {
    /**
     * 实际存放数据的地方
     */
    private E[] data;
    /**
     * 数组当前存放的数据个数(其实是指向下一个元素的索引)
     */
    private int size;

    public Array(int size) {
        this.data = (E[]) new Object[size];
        this.size = 0;
    }

    public Array() {
        //默认大小为10
        this(10);
    }

    /**
     * 添加新的元素到数组最后面
     *
     * @param element 想要添加的元素
     */
    public void addLast(E element) {
//        if (size == data.length) {
//            throw new RuntimeException("数组容量已满");
//        }
//        //赋值
//        data[size] = element;
//        size++;

        add(element, size);
    }

    /**
     * 添加到头部
     *
     * @param element
     */
    public void addFirst(E element) {
        add(element, 0);
    }

    /**
     * 添加元素到指定位置
     *
     * @param element 想要添加的元素
     * @param index   索引，从0开始
     */
    public void add(E element, int index) {
        if (size == data.length) {
            resize(data.length * 2);
        }
        if (index < 0 || index > size) {
            throw new RuntimeException("需要index>0 or <size");
        }
        //反向思考
        for (int i = 0; i < size - index; i++) {
            data[size - i] = data[size - i - 1];
        }
        data[index] = element;
        size++;
    }

    /**
     * 扩容
     */
    private void resize(int capacity) {
        E[] ts = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            ts[i] = data[i];
        }
        data = ts;
    }

    /**
     * 获取指定索引位置的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("index不合法");
        }
        return data[index];
    }


    /**
     * 获取最后一个元素
     *
     * @return
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 获取第一个元素
     *
     * @return
     */
    public E getFirst() {
        return get(0);
    }


    /**
     * 在指定索引位置设置元素
     *
     * @param element
     * @param index
     */
    public void set(E element, int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("index不合法");
        }
        data[index] = element;
    }

    /**
     * 是否存在元素
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element))
                return true;
        }
        return false;
    }

    /**
     * 移除指定位置的元素
     *
     * @param index
     * @return
     */
    public E rmIndexAt(int index) {
        //判断...省略

        //将index后面的元素都往前移动一位
        for (int i = 0; i < size - index - 1; i++) {
            data[i] = data[index + i + 1];
        }
        E e = data[size - 1];
        data[size - 1] = null;
        size--;
        //容量缩减
        if (size == data.length / 2) {
            resize(data.length / 2);
        }
        return e;
    }

    public E rmLast() {
        return rmIndexAt(data.length - 1);
    }

    public E rmFirst() {
        return rmIndexAt(0);
    }


    @Override
    public String toString() {
        return "Array{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Array<Integer> array = new Array<>(10);
        array.addLast(1);
        array.addLast(2);
        array.addLast(3);
        array.addLast(4);
        array.addLast(5);
        array.addLast(6);
        System.out.println(JSON.toJSONString(array.data, true));
        System.out.println(JSON.toJSONString(array.size, true));

        array.add(3, 5);

        System.out.println(JSON.toJSONString(array.data, true));
        System.out.println(JSON.toJSONString(array.size, true));

        System.out.println(array.contains(1));

        array.rmIndexAt(0);
        System.out.println(array.contains(1));


        array.addLast(6);
        array.addLast(6);
        array.addLast(6);
        array.addLast(6);
        array.addLast(6);
        array.addLast(6);


        System.out.println(JSON.toJSONString(array.data, true));
        System.out.println(JSON.toJSONString(array.size, true));
        array.rmLast();
        array.rmLast();
        array.rmLast();

        System.out.println(JSON.toJSONString(array.data, true));
        System.out.println(JSON.toJSONString(array.size, true));
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
