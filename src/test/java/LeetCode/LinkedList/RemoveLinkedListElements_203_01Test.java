package LeetCode.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElements_203_01Test {

    private final RemoveLinkedListElements_203_01 solution = new RemoveLinkedListElements_203_01();

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
    void testRemoveElements_case1() {
        int[] values = {1, 2, 6, 3, 4, 5, 6};
        ListNode list = createList(values);
        ListNode result = solution.removeElements(list, 6);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testRemoveElements_case2() {
        int[] values = {};
        ListNode list = createList(values);
        ListNode result = solution.removeElements(list, 1);
        int[] expected = {};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testRemoveElements_case3() {
        int[] values = {7, 7, 7, 7};
        ListNode list = createList(values);
        ListNode result = solution.removeElements(list, 7);
        int[] expected = {};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testRemoveElements_case4() {
        int[] values = {1, 2, 2, 1};
        ListNode list = createList(values);
        ListNode result = solution.removeElements(list, 2);
        int[] expected = {1, 1};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testRemoveElements_case5() {
        int[] values = {1, 2, 2, 1};
        ListNode list = createList(values);
        ListNode result = solution.removeElements(list, 1);
        int[] expected = {2, 2};
        assertArrayEquals(expected, listToArray(result));
    }
}