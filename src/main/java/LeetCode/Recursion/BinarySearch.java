package LeetCode.Recursion;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        return find(arr, target, 0, arr.length - 1);
    }


    private static int find(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;
        if (target < arr[mid]) {
            return find(arr, target, left, mid - 1);
        } else if (target > arr[mid]) {
            return find(arr, target, mid + 1, right);
        } else {
            return mid;
        }
    }
}
