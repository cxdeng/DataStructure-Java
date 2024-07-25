package LeetCode.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedLists_21_01Test {

    private final MergeTwoSortedLists_21_01 solution = new MergeTwoSortedLists_21_01();

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
    void testMergeTwoLists_case1() {
        int[] values1 = {1, 2, 4};
        int[] values2 = {1, 3, 4};
        ListNode list1 = createList(values1);
        ListNode list2 = createList(values2);
        ListNode result = solution.mergeTwoLists(list1, list2);
        int[] expected = {1, 1, 2, 3, 4, 4};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testMergeTwoLists_case2() {
        int[] values1 = {};
        int[] values2 = {};
        ListNode list1 = createList(values1);
        ListNode list2 = createList(values2);
        ListNode result = solution.mergeTwoLists(list1, list2);
        int[] expected = {};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testMergeTwoLists_case3() {
        int[] values1 = {};
        int[] values2 = {0};
        ListNode list1 = createList(values1);
        ListNode list2 = createList(values2);
        ListNode result = solution.mergeTwoLists(list1, list2);
        int[] expected = {0};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testMergeTwoLists_case4() {
        int[] values1 = {5, 10, 15};
        int[] values2 = {2, 3, 20};
        ListNode list1 = createList(values1);
        ListNode list2 = createList(values2);
        ListNode result = solution.mergeTwoLists(list1, list2);
        int[] expected = {2, 3, 5, 10, 15, 20};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testMergeTwoLists_case5() {
        int[] values1 = {1};
        int[] values2 = {2};
        ListNode list1 = createList(values1);
        ListNode list2 = createList(values2);
        ListNode result = solution.mergeTwoLists(list1, list2);
        int[] expected = {1, 2};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testMergeTwoLists_case6() {
        int[] values1 = {1, 3, 5, 7};
        int[] values2 = {2, 4, 6, 8};
        ListNode list1 = createList(values1);
        ListNode list2 = createList(values2);
        ListNode result = solution.mergeTwoLists(list1, list2);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    void testMergeTwoLists_case7() {
        int[] values1 = {1, 2, 2};
        int[] values2 = {1, 1, 2};
        ListNode list1 = createList(values1);
        ListNode list2 = createList(values2);
        ListNode result = solution.mergeTwoLists(list1, list2);
        int[] expected = {1, 1, 1, 2, 2, 2};
        assertArrayEquals(expected, listToArray(result));
    }

}