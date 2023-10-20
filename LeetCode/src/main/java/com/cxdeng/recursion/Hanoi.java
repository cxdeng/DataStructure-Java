package com.cxdeng.recursion;

import java.util.LinkedList;

public class Hanoi {

    static LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
    static LinkedList<Integer> c = new LinkedList<>();

    public static void printfHanoi(){
        System.out.println("================");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void init(int n) {
        for (int i = n; i >= 1; i--) {
            a.addLast(i);
        }
    }

    /**
     * @param n 圆盘个数
     * @param a Source
     * @param b Medium
     * @param c Target
     */
    public static void f(int n, LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c) {

        if (n == 0) {
            return;
        }

        f(n - 1, a, c, b);
        c.addLast(a.removeLast());
        f(n - 1, b, a, c);
    }
}
