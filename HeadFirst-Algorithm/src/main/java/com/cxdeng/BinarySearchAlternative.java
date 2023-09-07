package com.cxdeng;

public class BinarySearchAlternative {

    /**
     * @param arr    待查找的升序数组
     * @param target 待查找的目标值
     * @return 找到则返回索引
     * 找不到返回-1
     */
    public static int binarySearchAlternative(int[] arr, int target) {
        // 设置指针和初值
        int left = 0, right = arr.length;

        // 范围内有数据
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (target < arr[mid]) {
                right = mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
