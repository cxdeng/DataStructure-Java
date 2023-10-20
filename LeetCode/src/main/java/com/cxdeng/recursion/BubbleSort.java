package com.cxdeng.recursion;

public class BubbleSort {

    public static void sort(int[] arr) {
        bubble(arr, arr.length - 1);
    }


    /**
     * @param arr 待排序数组
     * @param right 未排序区域的右边界
     */
    private static void bubble(int[] arr, int right) {

        if (right == 0) {
            return;
        }

        int x = 0;
        for (int i = 0; i < right; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                x = i;
            }
        }

        //bubble(arr, right - 1);
        bubble(arr, x);
    }
}
