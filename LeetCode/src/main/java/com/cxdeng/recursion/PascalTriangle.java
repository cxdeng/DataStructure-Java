package com.cxdeng.recursion;

public class PascalTriangle {

    public static int f(int i, int j) {
        if (j == 0 || i == j) {
            return 1;
        }
        return f(i - 1, j - 1) + f(i - 1, j);
    }

}
