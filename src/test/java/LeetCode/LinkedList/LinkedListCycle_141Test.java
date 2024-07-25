package LeetCode.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycle_141Test {

    @Test
    void testEmptyList() {
        ListNode head = null;
        LinkedListCycle_141 solution = new LinkedListCycle_141();
        assertFalse(solution.hasCycle(head), "Empty list should not have a cycle");
    }

    @Test
    void testSingleElementListNoCycle() {
        ListNode head = new ListNode(1);
        LinkedListCycle_141 solution = new LinkedListCycle_141();
        assertFalse(solution.hasCycle(head), "Single element list should not have a cycle");
    }

    @Test
    void testSingleElementListWithCycle() {
        ListNode head = new ListNode(1);
        head.next = head; // Creating a cycle
        LinkedListCycle_141 solution = new LinkedListCycle_141();
        assertTrue(solution.hasCycle(head), "Single element list with cycle should have a cycle");
    }

    @Test
    void testMultipleElementsNoCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        LinkedListCycle_141 solution = new LinkedListCycle_141();
        assertFalse(solution.hasCycle(head), "List 1 -> 2 -> 3 -> 4 should not have a cycle");
    }

    @Test
    void testMultipleElementsWithCycle() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creating a cycle
        LinkedListCycle_141 solution = new LinkedListCycle_141();
        assertTrue(solution.hasCycle(head), "List with cycle should have a cycle");
    }


}