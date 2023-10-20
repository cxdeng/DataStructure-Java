package com.cxdeng.recursion;

public class Factorial {

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }

        return n * f(n - 1);
    }
}
