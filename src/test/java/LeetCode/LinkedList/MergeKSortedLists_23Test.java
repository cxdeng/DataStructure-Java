package LeetCode.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedLists_23Test {


    @Test
    void testMergeKLists_AllEmpty() {
        MergeKSortedLists_23 merger = new MergeKSortedLists_23();
        ListNode[] lists = new ListNode[]{};
        ListNode result = merger.mergeKLists(lists);
        assertNull(result, "Merging an empty array of lists should return null.");
    }

    @Test
    void testMergeKLists_SingleEmptyList() {
        MergeKSortedLists_23 merger = new MergeKSortedLists_23();
        ListNode[] lists = new ListNode[]{null};
        ListNode result = merger.mergeKLists(lists);
        assertNull(result, "Merging a single empty list should return null.");
    }

    @Test
    void testMergeKLists_SingleNonEmptyList() {
        MergeKSortedLists_23 merger = new MergeKSortedLists_23();
        ListNode[] lists = new ListNode[]{new ListNode(1, new ListNode(2, new ListNode(3)))};
        ListNode result = merger.mergeKLists(lists);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertNull(result.next.next.next, "The merged list should be properly terminated.");
    }

    @Test
    void testMergeKLists_MultipleEmptyLists() {
        MergeKSortedLists_23 merger = new MergeKSortedLists_23();
        ListNode[] lists = new ListNode[]{null, null, null};
        ListNode result = merger.mergeKLists(lists);
        assertNull(result, "Merging multiple empty lists should return null.");
    }

    @Test
    void testMergeKLists_MixedEmptyAndNonEmptyLists() {
        MergeKSortedLists_23 merger = new MergeKSortedLists_23();
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = null;
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = new ListNode[]{l1, l2, l3};
        ListNode result = merger.mergeKLists(lists);
        int[] expectedValues = {1, 2, 4, 5, 6};
        for (int val : expectedValues) {
            assertNotNull(result);
            assertEquals(val, result.val);
            result = result.next;
        }
        assertNull(result, "The merged list should be properly terminated.");
    }

    @Test
    void testMergeKLists_MultipleNonEmptyLists() {
        MergeKSortedLists_23 merger = new MergeKSortedLists_23();
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = new ListNode[]{l1, l2, l3};
        ListNode result = merger.mergeKLists(lists);
        int[] expectedValues = {1, 1, 2, 3, 4, 4, 5, 6};
        for (int val : expectedValues) {
            assertNotNull(result);
            assertEquals(val, result.val);
            result = result.next;
        }
        assertNull(result, "The merged list should be properly terminated.");
    }

    @Test
    void testMergeKLists_DuplicateElements() {
        MergeKSortedLists_23 merger = new MergeKSortedLists_23();
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(4));
        ListNode[] lists = new ListNode[]{l1, l2, l3};
        ListNode result = merger.mergeKLists(lists);
        int[] expectedValues = {1, 1, 2, 3, 4, 4, 4, 4};
        for (int val : expectedValues) {
            assertNotNull(result);
            assertEquals(val, result.val);
            result = result.next;
        }
        assertNull(result, "The merged list should be properly terminated.");
    }

}