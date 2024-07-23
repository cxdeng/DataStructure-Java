package LeetCode.Recursion;

import java.util.LinkedList;

public class Hanoi {

    static LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
    static LinkedList<Integer> c = new LinkedList<>();

    // 3 2 1
    static void init(int n) {
        for (int i = n; i >= 1; i--) {
            a.addLast(i);
        }
    }

    public static void move(int n, LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c) {
        if (n == 0) {
            return;
        }

        move(n - 1, a, c, b);
        c.addLast(a.removeLast());
        move(n - 1, b, a, c);
    }
}
