package com.cxdeng.recursion;


public class Fibonacci_Fog {

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return f(n - 1) + f(n - 2);
    }
}
