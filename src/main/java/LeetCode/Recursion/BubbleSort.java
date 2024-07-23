package LeetCode.Recursion;

public class BubbleSort {
    public static void bubbleSortNonRecur(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void bubbleSortRecur(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Added check for empty array
        }

        sortRecur(arr, arr.length - 1);
    }

    private static void sortRecur(int[] arr, int right) {
        if (right == 0) {
            return;
        }

        for (int i = 0; i < right; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        sortRecur(arr, right - 1);
    }


    public static void bubbleSortRecurOptimise(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Added check for empty array
        }

        sortRecurOptimise(arr, arr.length - 1);
    }

    private static void sortRecurOptimise(int[] arr, int right) {
        if (right == 0) {
            return;
        }

        int x = 0;
        for (int i = 0; i < right; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                x = i;
            }
        }

        sortRecurOptimise(arr, x);
    }
}
