package HeadFirstAlgorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static HeadFirstAlgorithm.BinarySearch.binarySearchAlternative;
import static HeadFirstAlgorithm.BinarySearch.binarySearchBasic;
import static org.junit.jupiter.api.Assertions.assertEquals;


class BinarySearchTest {

    private static final int[] arr = new int[]{7, 13, 21, 30, 38, 44, 52, 53};


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
}