package com.cxdeng.recursion;

public class InsertionSort {

    public static void sort(int[] arr) {
        insertionSort(arr, 1);
    }


    /**
     * @param arr  待排序数组
     * @param left left是未排序的下边界
     */
    private static void insertionSort(int[] arr, int left) {
        if (left == arr.length) {
            return;
        }

        int temp = arr[left];
        int i = left - 1;   // 已排序区域的指针

        while (i >= 0 && arr[i] > temp) { // 没有找到插入位置
            arr[i + 1] = arr[i];    // 空出插入位置
            i--;
        }

        // 找到插入位置
        arr[i + 1] = temp;

        insertionSort(arr, left + 1);
    }
}
