package com.cxdeng;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.cxdeng.BinarySearchJava.binarySearchBasic;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchJavaTest {

    @Test
    @DisplayName("FOUND")
    void binarySearchJavaFoundTest() {
        int[] arr = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, binarySearchBasic(arr, 7));
        assertEquals(1, binarySearchBasic(arr, 13));
        assertEquals(2, binarySearchBasic(arr, 21));
        assertEquals(3, binarySearchBasic(arr, 30));
        assertEquals(4, binarySearchBasic(arr, 38));
        assertEquals(5, binarySearchBasic(arr, 44));
        assertEquals(6, binarySearchBasic(arr, 52));
        assertEquals(7, binarySearchBasic(arr, 53));
    }

    @Test
    @DisplayName("NOT FOUND")
    void binarySearchAJavaNotFoundTest() {
        int[] arr = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(-1, binarySearchBasic(arr, 0));
        assertEquals(-3, binarySearchBasic(arr, 15));
        assertEquals(-9, binarySearchBasic(arr, 60));
    }
}