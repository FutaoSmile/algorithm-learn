package com.futao.algorithm.link;

/**
 * @author futao
 * Created on 2020/4/21.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list);
        list.addFirst(1);
        System.out.println(list);
        list.addFirst(2);
        System.out.println(list);
        list.addFirst(3);
        System.out.println(list);

//        list.addLast(2);
//        System.out.println(list);
//        list.addLast(3);
//        System.out.println(list);

        list.add(2, 999);
        System.out.println(list);

        System.out.println("-------");

        list.rmFirst();
        System.out.println(list);

        list.rmFirst();
        System.out.println(list);
        list.rmFirst();
        System.out.println(list);
        list.rmFirst();
        System.out.println(list);
        list.rmFirst();
        System.out.println(list);


        System.out.println("-------");

        list.addFirst(1);
        System.out.println(list);
        list.addFirst(2);
        System.out.println(list);
        list.addFirst(3);
        System.out.println(list);

        list.rmLast();
        System.out.println(list);

        list.rmLast();
        System.out.println(list);

        list.rmLast();
        System.out.println(list);

        System.out.println("------------------------");
        for (int i = 0; i < 10; i++) {
            list.addLast(i);
            System.out.println(list);
        }

        for (int i = 0; i < 10; i++) {
            list.addFirst(i);
            System.out.println(list);
        }


    }
}
