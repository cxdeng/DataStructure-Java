package com.cxdeng;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.cxdeng.BinarySearchAlternative.binarySearchAlternative;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchAlternativeTest {

    @Test
    @DisplayName("FOUND")
    void binarySearchAlternativeFoundTest() {
        int[] arr = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, binarySearchAlternative(arr, 7));
        assertEquals(1, binarySearchAlternative(arr, 13));
        assertEquals(2, binarySearchAlternative(arr, 21));
        assertEquals(3, binarySearchAlternative(arr, 30));
        assertEquals(4, binarySearchAlternative(arr, 38));
        assertEquals(5, binarySearchAlternative(arr, 44));
        assertEquals(6, binarySearchAlternative(arr, 52));
        assertEquals(7, binarySearchAlternative(arr, 53));
    }

    @Test
    @DisplayName("NOT FOUND")
    void binarySearchAlternativeNotFoundTest() {
        int[] arr = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(-1, binarySearchAlternative(arr, 0));
        assertEquals(-1, binarySearchAlternative(arr, 15));
        assertEquals(-1, binarySearchAlternative(arr, 60));
    }
}