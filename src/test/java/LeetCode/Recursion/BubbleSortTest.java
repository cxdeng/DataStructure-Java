package LeetCode.Recursion;

import org.junit.jupiter.api.Test;

import static LeetCode.Recursion.BubbleSort.bubbleSortRecur;
import static LeetCode.Recursion.BubbleSort.bubbleSortRecurOptimise;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void testBubbleSortNonRecurSortedArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BubbleSort.bubbleSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortNonRecurReverseArray() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BubbleSort.bubbleSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortNonRecurUnsortedArray() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        BubbleSort.bubbleSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortNonRecurEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        BubbleSort.bubbleSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortNonRecurSingleElementArray() {
        int[] arr = {1};
        int[] expected = {1};
        BubbleSort.bubbleSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortNonRecurDuplicateElementsArray() {
        int[] arr = {4, 5, 3, 4, 2, 4};
        int[] expected = {2, 3, 4, 4, 4, 5};
        BubbleSort.bubbleSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurSortedArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bubbleSortRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurReverseArray() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bubbleSortRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurUnsortedArray() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        bubbleSortRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        bubbleSortRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurSingleElementArray() {
        int[] arr = {1};
        int[] expected = {1};
        bubbleSortRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurDuplicateElementsArray() {
        int[] arr = {4, 5, 3, 4, 2, 4};
        int[] expected = {2, 3, 4, 4, 4, 5};
        bubbleSortRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurOptimiseSortedArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bubbleSortRecurOptimise(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurOptimiseReverseArray() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bubbleSortRecurOptimise(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurOptimiseUnsortedArray() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        bubbleSortRecurOptimise(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurOptimiseEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        bubbleSortRecurOptimise(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurOptimiseSingleElementArray() {
        int[] arr = {1};
        int[] expected = {1};
        bubbleSortRecurOptimise(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortRecurOptimiseDuplicateElementsArray() {
        int[] arr = {4, 5, 3, 4, 2, 4};
        int[] expected = {2, 3, 4, 4, 4, 5};
        bubbleSortRecurOptimise(arr);
        assertArrayEquals(expected, arr);
    }
}