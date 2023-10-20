package com.cxdeng.recursion;

import java.util.Arrays;

public class Fibonacci_509 {

    public static int f(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return f(n - 1) + f(n - 2);
    }


    public static int f(int n, int[] cache) {
        if (cache[n] != -1) {
            return cache[n];
        }

        int x = f(n - 1);
        int y = f(n - 2);
        cache[n] = x + y;

        return cache[n];
    }


    public static int memorizationF(int n) {
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1); // [-1, -1, -,1, -1, -1, -1]
        cache[0] = 0;
        cache[1] = 1;

        return f(n, cache);
    }
}
