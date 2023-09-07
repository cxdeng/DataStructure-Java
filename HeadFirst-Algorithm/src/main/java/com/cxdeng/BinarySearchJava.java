package com.cxdeng;

public class BinarySearchJava {
    /**
     * @param arr    待查找的升序数组
     * @param target 待查找的目标值
     * @return 找到则返回索引
     * 找不到返回-1
     */
    public static int binarySearchBasic(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        // - (insertion point + 1)
        return -(left + 1);
    }
}
