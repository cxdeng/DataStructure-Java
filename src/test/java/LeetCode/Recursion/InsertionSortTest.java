package LeetCode.Recursion;

import org.junit.jupiter.api.Test;

import static LeetCode.Recursion.InsertionSort.insertionSortNonRecur;
import static LeetCode.Recursion.InsertionSort.insertionSortRecur;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    @Test
    public void testInsertionSortNonRecurEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        insertionSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSortNonRecurSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSortNonRecurReverseArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSortNonRecurUnsortedArray() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        insertionSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSortNonRecurDuplicateArray() {
        int[] arr = {4, 5, 3, 4, 2, 4};
        int[] expected = {2, 3, 4, 4, 4, 5};
        insertionSortNonRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSortRecurEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        insertionSortRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSortRecurSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSortRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSortRecurReverseArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSortRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSortRecurUnsortedArray() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        insertionSortRecur(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSortRecurDuplicateArray() {
        int[] arr = {4, 5, 3, 4, 2, 4};
        int[] expected = {2, 3, 4, 4, 4, 5};
        insertionSortRecur(arr);
        assertArrayEquals(expected, arr);
    }
}