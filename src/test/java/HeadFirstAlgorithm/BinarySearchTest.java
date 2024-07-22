package HeadFirstAlgorithm;

import org.junit.jupiter.api.Test;

import static HeadFirstAlgorithm.BinarySearch.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class BinarySearchTest {

    private static final int[] arr = new int[]{7, 13, 21, 30, 38, 44, 52, 53};

    private static final int[] theMostArr = new int[]{1, 2, 4, 4, 4, 5, 6, 6, 7};


    @Test
    void binarySearchBasicFound() {
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
    void binarySearchBasicNotFound() {
        assertEquals(-1, binarySearchBasic(arr, 0));
        assertEquals(-1, binarySearchBasic(arr, 15));
        assertEquals(-1, binarySearchBasic(arr, 60));
    }


    @Test
    void binarySearchAlternativeFound() {
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
    void binarySearchAlternativeNotFound() {
        assertEquals(-1, binarySearchAlternative(arr, 0));
        assertEquals(-1, binarySearchAlternative(arr, 15));
        assertEquals(-1, binarySearchAlternative(arr, 60));
    }


    @Test
    void binarySearchBalanceFound() {
        assertEquals(0, binarySearchBalance(arr, 7));
        assertEquals(1, binarySearchBalance(arr, 13));
        assertEquals(2, binarySearchBalance(arr, 21));
        assertEquals(3, binarySearchBalance(arr, 30));
        assertEquals(4, binarySearchBalance(arr, 38));
        assertEquals(5, binarySearchBalance(arr, 44));
        assertEquals(6, binarySearchBalance(arr, 52));
        assertEquals(7, binarySearchBalance(arr, 53));
    }


    @Test
    void binarySearchBalanceNotFound() {
        assertEquals(-1, binarySearchBalance(arr, 0));
        assertEquals(-1, binarySearchBalance(arr, 15));
        assertEquals(-1, binarySearchBalance(arr, 60));
    }


    @Test
    void binarySearchJavaFound() {
        assertEquals(0, binarySearchJava(arr, 7));
        assertEquals(1, binarySearchJava(arr, 13));
        assertEquals(2, binarySearchJava(arr, 21));
        assertEquals(3, binarySearchJava(arr, 30));
        assertEquals(4, binarySearchJava(arr, 38));
        assertEquals(5, binarySearchJava(arr, 44));
        assertEquals(6, binarySearchJava(arr, 52));
        assertEquals(7, binarySearchJava(arr, 53));
    }


    @Test
    void binarySearchJavaNotFound() {
        assertEquals(-1, binarySearchJava(arr, 0));
        assertEquals(-3, binarySearchJava(arr, 15));
        assertEquals(-9, binarySearchJava(arr, 60));
    }


    @Test
    void binarySearchLeftMostFound() {
        assertEquals(0, binarySearchLeftMost(theMostArr, 1));
        assertEquals(1, binarySearchLeftMost(theMostArr, 2));
        assertEquals(2, binarySearchLeftMost(theMostArr, 4));
        assertEquals(5, binarySearchLeftMost(theMostArr, 5));
        assertEquals(6, binarySearchLeftMost(theMostArr, 6));
        assertEquals(8, binarySearchLeftMost(theMostArr, 7));
    }


    @Test
    void binarySearchLeftMostNotFound() {
        assertEquals(-1, binarySearchLeftMost(theMostArr, 0));
        assertEquals(-1, binarySearchLeftMost(theMostArr, 3));
        assertEquals(-1, binarySearchLeftMost(theMostArr, 8));
    }


    @Test
    void binarySearchRightMostFound() {
        assertEquals(0, binarySearchLRightMost(theMostArr, 1));
        assertEquals(1, binarySearchLRightMost(theMostArr, 2));
        assertEquals(4, binarySearchLRightMost(theMostArr, 4));
        assertEquals(5, binarySearchLRightMost(theMostArr, 5));
        assertEquals(7, binarySearchLRightMost(theMostArr, 6));
        assertEquals(8, binarySearchLRightMost(theMostArr, 7));
    }


    @Test
    void binarySearchLRightMostNotFound() {
        assertEquals(-1, binarySearchLRightMost(theMostArr, 0));
        assertEquals(-1, binarySearchLRightMost(theMostArr, 3));
        assertEquals(-1, binarySearchLRightMost(theMostArr, 8));
    }


    @Test
    void binarySearchLeftMostAdvancedFound() {
        assertEquals(0, binarySearchLeftMostAdvanced(theMostArr, 1));
        assertEquals(1, binarySearchLeftMostAdvanced(theMostArr, 2));
        assertEquals(2, binarySearchLeftMostAdvanced(theMostArr, 4));
        assertEquals(5, binarySearchLeftMostAdvanced(theMostArr, 5));
        assertEquals(6, binarySearchLeftMostAdvanced(theMostArr, 6));
        assertEquals(8, binarySearchLeftMostAdvanced(theMostArr, 7));
    }


    @Test
    void binarySearchLeftMostAdvancedNotFound() {
        assertEquals(0, binarySearchLeftMostAdvanced(theMostArr, 0));
        assertEquals(2, binarySearchLeftMostAdvanced(theMostArr, 3));
        assertEquals(9, binarySearchLeftMostAdvanced(theMostArr, 8));
    }


    @Test
    void binarySearchRightMostAdvancedFound() {
        assertEquals(0, binarySearchLRightMostAdvanced(theMostArr, 1));
        assertEquals(1, binarySearchLRightMostAdvanced(theMostArr, 2));
        assertEquals(4, binarySearchLRightMostAdvanced(theMostArr, 4));
        assertEquals(5, binarySearchLRightMostAdvanced(theMostArr, 5));
        assertEquals(7, binarySearchLRightMostAdvanced(theMostArr, 6));
        assertEquals(8, binarySearchLRightMostAdvanced(theMostArr, 7));
    }


    @Test
    void binarySearchRightMostAdvancedNotFound() {
        assertEquals(-1, binarySearchLRightMostAdvanced(theMostArr, 0));
        assertEquals(1, binarySearchLRightMostAdvanced(theMostArr, 3));
        assertEquals(8, binarySearchLRightMostAdvanced(theMostArr, 8));
    }
}