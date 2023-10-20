package com.cxdeng.recursion;

public class BinarySearch {

    public static int search(int[] arr, int target) {

        return f(arr, target, 0, arr.length - 1);
    }


    private static int f(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) >>> 1;

        if (target < arr[mid]) {
            return f(arr, target, left, mid - 1);
        } else if (target > arr[mid]) {
            return f(arr, target, mid + 1, right);
        } else {
            return mid;
        }
    }

}
