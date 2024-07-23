package LeetCode.BinarySearch;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public int[] searchRange(int[] nums, int target) {
        int x = leftMost(nums, target);
        if (x != -1) {
            return new int[]{x, rightMost(nums, target)};
        } else {
            return new int[]{-1, -1};
        }
    }

    private int leftMost(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int candidate = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]){
                left = mid + 1;
            }else {
                candidate = mid;
                right = mid - 1;
            }
        }

        return candidate;
    }

    private int rightMost(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int candidate = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            }else {
                candidate = mid;
                left = mid + 1;
            }
        }
        return candidate;
    }
}
