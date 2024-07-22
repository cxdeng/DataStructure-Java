package HeadFirstAlgorithm;

public class BinarySearch {


    /**
     * BinarySearch Basic
     *
     * @param arr    Array to be searched
     * @param target Target value
     * @return If find the target, return index,
     * else return -1
     */
    public static int binarySearchBasic(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < arr[mid]) {    // target on the left
                right = mid - 1;
            } else if (target > arr[mid]) {    // target on the right
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


    /**
     * BinarySearch Alternative
     *
     * @param arr    Array to be searched
     * @param target Target value
     * @return If find the target, return index,
     * else return -1
     */
    public static int binarySearchAlternative(int[] arr, int target) {

        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target < arr[mid]) {    // target on the left
                right = mid;
            } else if (target > arr[mid]) {    // target on the right
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


    /**
     * BinarySearch Balance
     *
     * @param arr    Array to be searched
     * @param target Target value
     * @return If find the target, return index,
     * else return -1
     */
    public static int binarySearchBalance(int[] arr, int target) {

        int left = 0;
        int right = arr.length;

        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (target < arr[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (arr[left] == target) {
            return left;
        }

        return -1;
    }


    /**
     * BinarySearch Balance
     *
     * @param arr    Array to be searched
     * @param target Target value
     * @return If find the target, return index,
     * Otherwise, (-(insertion point) - 1)
     */
    public static int binarySearchJava(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            int midVal = arr[mid];

            if (target < midVal) {
                right = mid - 1;
            } else if (target > midVal) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        // Key not found
        return -(left + 1);
    }


    /**
     * BinarySearch LeftMost
     *
     * @param arr    Array to be searched
     * @param target Target value
     * @return If find the target, return the leftmost index,
     * Otherwise, return -1
     */
    public static int binarySearchLeftMost(int[] arr, int target) {

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
                candidate = mid;
                right = mid - 1;
            }
        }

        return candidate;
    }


    /**
     * BinarySearch RightMost
     *
     * @param arr    Array to be searched
     * @param target Target value
     * @return If find the target, return the rightmost index,
     * Otherwise, return -1
     */
    public static int binarySearchLRightMost(int[] arr, int target) {

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
                candidate = mid;
                left = mid + 1;
            }
        }

        return candidate;
    }


    /**
     * Advanced LeftMost BinarySearch
     *
     * @param arr    Array to be searched
     * @param target Target value
     * @return If find the target, return the leftmost index,
     * Otherwise, Return the leftmost index of an element that is greater than or equal to the target.
     */
    public static int binarySearchLeftMostAdvanced(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target <= arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }


    /**
     * Advanced RightMost BinarySearch
     *
     * @param arr    Array to be searched
     * @param target Target value
     * @return If find the target, return the rightmost index,
     * Otherwise, return the rightmost index of an element that is less than or equal to the target.
     */
    public static int binarySearchLRightMostAdvanced(int[] arr, int target) {

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

        return left - 1;
    }
}
