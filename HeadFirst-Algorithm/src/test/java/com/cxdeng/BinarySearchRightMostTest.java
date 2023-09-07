package com.cxdeng;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.cxdeng.BinarySearchRightMost.binarySearchRightMost;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchRightMostTest {

    @Test
    @DisplayName("FOUND")
    void binarySearchLeftMostFoundTest() {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7,};
        assertEquals(0, binarySearchRightMost(arr, 1));
        assertEquals(1, binarySearchRightMost(arr, 2));
        assertEquals(4, binarySearchRightMost(arr, 4));
        assertEquals(5, binarySearchRightMost(arr, 5));
        assertEquals(6, binarySearchRightMost(arr, 6));
        assertEquals(7, binarySearchRightMost(arr, 7));

        assertEquals(-1, binarySearchRightMost(arr, 0));
        assertEquals(-1, binarySearchRightMost(arr, 3));
        assertEquals(-1, binarySearchRightMost(arr, 8));
    }
}