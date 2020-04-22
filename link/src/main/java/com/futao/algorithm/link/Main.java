package com.futao.algorithm.link;

/**
 * @author futao
 * Created on 2020/4/21.
 */
public class Main {
    public static void main(String[] args) {
        linkedListSuperTest();
//        rmTest();
    }


    public static void rmTest() {
        LinkedListSuper<Integer> listSuper = new LinkedListSuper<>();
        for (int i = 0; i < 10; i++) {
            listSuper.addLast(i);
        }
        System.out.println(listSuper);
        listSuper.rmAt(0);
        System.out.println(listSuper);

        listSuper.rmAt(8);
        System.out.println(listSuper);


    }


    public static void linkedListSuperTest() {
        LinkedListSuper<Integer> listSuper = new LinkedListSuper<>();
        System.out.println(listSuper);
        listSuper.add(123, 0);
        System.out.println(listSuper);
        listSuper.set(123131, 0);
        System.out.println(listSuper);

        for (int i = 0; i < 10; i++) {
            listSuper.addFirst(i);
            System.out.println(listSuper);
        }

        listSuper.set(999999, 5);

        System.out.println(listSuper);

        for (int i = 0; i < 10; i++) {
            listSuper.addLast(i);
            System.out.println(listSuper);
        }
        for (int i = 5; i < 15; i++) {
            listSuper.rmAt(i);
            System.out.println(listSuper);
        }
    }
}
