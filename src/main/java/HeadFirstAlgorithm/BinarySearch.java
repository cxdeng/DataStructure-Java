package HeadFirstAlgorithm;

public class BinarySearch {


    /**
     * BinarySearch Basic
     * @param arr Array to be searched
     * @param target Target value
     * @return
     *  If find the target, return index
     *  else return -1
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
     * @param arr Array to be searched
     * @param target Target value
     * @return
     *  If find the target, return index
     *  else return -1
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

}
