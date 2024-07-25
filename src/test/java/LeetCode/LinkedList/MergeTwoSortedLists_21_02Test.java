package LeetCode.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedLists_21_02Test {

    @Test
    void testMergeTwoLists_BothEmpty() {
        MergeTwoSortedLists_21_02 merger = new MergeTwoSortedLists_21_02();
        ListNode result = merger.mergeTwoLists(null, null);
        assertNull(result, "Merging two empty lists should return null.");
    }

    @Test
    void testMergeTwoLists_FirstEmpty() {
        MergeTwoSortedLists_21_02 merger = new MergeTwoSortedLists_21_02();
        ListNode p2 = new ListNode(1);
        ListNode result = merger.mergeTwoLists(null, p2);
        assertEquals(p2, result, "Merging an empty list with a non-empty list should return the non-empty list.");
    }

    @Test
    void testMergeTwoLists_SecondEmpty() {
        MergeTwoSortedLists_21_02 merger = new MergeTwoSortedLists_21_02();
        ListNode p1 = new ListNode(1);
        ListNode result = merger.mergeTwoLists(p1, null);
        assertEquals(p1, result, "Merging a non-empty list with an empty list should return the non-empty list.");
    }

    @Test
    void testMergeTwoLists_SingleElementLists() {
        MergeTwoSortedLists_21_02 merger = new MergeTwoSortedLists_21_02();
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode result = merger.mergeTwoLists(p1, p2);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertNull(result.next.next, "The merged list should be properly terminated.");
    }

    @Test
    void testMergeTwoLists_MultipleElements() {
        MergeTwoSortedLists_21_02 merger = new MergeTwoSortedLists_21_02();
        ListNode p1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode p2 = new ListNode(2, new ListNode(4, new ListNode(6)));
        ListNode result = merger.mergeTwoLists(p1, p2);
        int[] expectedValues = {1, 2, 3, 4, 5, 6};
        for (int val : expectedValues) {
            assertNotNull(result);
            assertEquals(val, result.val);
            result = result.next;
        }
        assertNull(result, "The merged list should be properly terminated.");
    }

    @Test
    void testMergeTwoLists_DuplicateElements() {
        MergeTwoSortedLists_21_02 merger = new MergeTwoSortedLists_21_02();
        ListNode p1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode p2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = merger.mergeTwoLists(p1, p2);
        int[] expectedValues = {1, 1, 3, 3, 4, 5};
        for (int val : expectedValues) {
            assertNotNull(result);
            assertEquals(val, result.val);
            result = result.next;
        }
        assertNull(result, "The merged list should be properly terminated.");
    }
}