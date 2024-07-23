package LeetCode.Recursion;

public class InsertionSort {
    public static void insertionSortNonRecur(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void insertionSortRecur(int[] arr) {
        if (arr.length == 0){
            return;
        }

        insertRecur(arr, 1);
    }

    private static void insertRecur(int[] arr, int currentIndex) {
        if (currentIndex == arr.length) {
            return;
        }

        int currentElement = arr[currentIndex];
        int position = currentIndex - 1;

        // 移动 arr[0..currentIndex-1] 中大于 currentElement 的元素
        while (position >= 0 && arr[position] > currentElement) {
            arr[position + 1] = arr[position];
            position--;
        }
        arr[position + 1] = currentElement;

        // 递归处理下一个元素
        insertRecur(arr, currentIndex + 1);
    }
}
