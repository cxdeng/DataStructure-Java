package LeetCode.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedList_83_02Test {

    private final RemoveDuplicatesFromSortedList_83_02 solution = new RemoveDuplicatesFromSortedList_83_02();

    private ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private int[] listToArray(ListNode head) {
        if (head == null) return new int[0];
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        int[] result = new int[size];
        current = head;
        for (int i = 0; i < size; i++) {
            result[i] = current.val;
            current = current.next;
        }
        return result;
    }

    @Test
    void testDeleteDuplicates_case1() {
        int[] values = {1, 1, 2};
        ListNode list = createList(values);
        ListNode result = solution.deleteDuplicates(list);
        int[] expected = {1, 2};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_case2() {
        int[] values = {1, 1, 2, 3, 3};
        ListNode list = createList(values);
        ListNode result = solution.deleteDuplicates(list);
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_case3() {
        int[] values = {1, 1, 1};
        ListNode list = createList(values);
        ListNode result = solution.deleteDuplicates(list);
        int[] expected = {1};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_case4() {
        int[] values = {};
        ListNode list = createList(values);
        ListNode result = solution.deleteDuplicates(list);
        int[] expected = {};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_case5() {
        int[] values = {1, 2, 3, 4, 5};
        ListNode list = createList(values);
        ListNode result = solution.deleteDuplicates(list);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_case6() {
        int[] values = {1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        ListNode list = createList(values);
        ListNode result = solution.deleteDuplicates(list);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_case7() {
        int[] values = {1, 2, 2, 3, 4, 4, 5, 5, 5, 6};
        ListNode list = createList(values);
        ListNode result = solution.deleteDuplicates(list);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_case8() {
        int[] values = {1};
        ListNode list = createList(values);
        ListNode result = solution.deleteDuplicates(list);
        int[] expected = {1};
        assertArrayEquals(expected, listToArray(result));
    }

}