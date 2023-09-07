package com.cxdeng;

public class BinarySearchBasic {

    /**
     * @param arr    待查找的升序数组
     * @param target 待查找的目标值
     * @return 找到则返回索引
     * 找不到返回-1
     */
    public static int binarySearchBasic(int[] arr, int target) {
        // 设置指针和初值
        int left = 0, right = arr.length - 1;

        // 范围内有数据
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target < arr[mid]) {
                // 目标值在中间值的左边
                right = mid - 1;
            } else if (target > arr[mid]) {
                // 目标值在中间值的右边
                left = mid + 1;
            } else {
                // 若相等，则返回索引
                return mid;
            }
        }
        return -1;
    }
}
