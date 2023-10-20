package com.cxdeng.recursion;

public class Fibonacci_Rabbit {
    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }


        return f(n - 1) + f(n - 2);
    }
}
