package LeetCode.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedList_206_04Test {

    @Test
    public void testReverseEmptyList() {
        ReverseLinkedList_206_04 solution = new ReverseLinkedList_206_04();
        ListNode head = null;
        ListNode result = solution.reverseList(head);
        assertNull(result);
    }

    @Test
    public void testReverseSingleElementList() {
        ReverseLinkedList_206_04 solution = new ReverseLinkedList_206_04();
        ListNode head = new ListNode(1);
        ListNode result = solution.reverseList(head);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    public void testReverseMultipleElementList() {
        ReverseLinkedList_206_04 solution = new ReverseLinkedList_206_04();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = solution.reverseList(head);
        assertNotNull(result);
        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);
        assertNull(result.next.next.next.next.next);
    }

    @Test
    public void testReverseListWithDuplicateValues() {
        ReverseLinkedList_206_04 solution = new ReverseLinkedList_206_04();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        ListNode result = solution.reverseList(head);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
        assertNull(result.next.next.next.next);
    }
}