package com.cxdeng;

public class BinarySearchRightMost {

    /**
     *
     * @param arr 待查找的升序数组
     * @param target 待查找的目标值
     * @return 找到则返回最右的索引
     *         找不到则返回 -1
     */
    public static int binarySearchRightMost(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        int candidate = -1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                // candidate location
                candidate = mid;
                left = mid + 1;
            }
        }

        return candidate;
    }


    /**
     * @param arr    待查找的升序数组
     * @param target 待查找的目标值
     * @return 返回 <= target的最右索引
     */
    public static int binarySearchRightMostOptimization(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        /*
         * 找到则返回最右的索引
         * 找不到则返回 比目标大的 最左索引
         * */
        return left - 1;
    }
}
