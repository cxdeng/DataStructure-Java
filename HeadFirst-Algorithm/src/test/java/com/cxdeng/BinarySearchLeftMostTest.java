package com.cxdeng;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.cxdeng.BinarySearchLeftMost.binarySearchLeftMost;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchLeftMostTest {

    @Test
    @DisplayName("FOUND")
    void binarySearchLeftMostFoundTest() {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7,};
        assertEquals(0, binarySearchLeftMost(arr, 1));
        assertEquals(1, binarySearchLeftMost(arr, 2));
        assertEquals(2, binarySearchLeftMost(arr, 4));
        assertEquals(5, binarySearchLeftMost(arr, 5));
        assertEquals(6, binarySearchLeftMost(arr, 6));
        assertEquals(7, binarySearchLeftMost(arr, 7));

        assertEquals(-1, binarySearchLeftMost(arr, 0));
        assertEquals(-1, binarySearchLeftMost(arr, 3));
        assertEquals(-1, binarySearchLeftMost(arr, 8));
    }
}