package LeetCode.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedList_876Test {

    @Test
    void testMiddleNode_SingleElement() {
        MiddleOfTheLinkedList_876 solution = new MiddleOfTheLinkedList_876();
        ListNode head = new ListNode(1);
        ListNode result = solution.middleNode(head);
        assertEquals(1, result.val, "Middle of single element list should be the element itself.");
    }

    @Test
    void testMiddleNode_TwoElements() {
        MiddleOfTheLinkedList_876 solution = new MiddleOfTheLinkedList_876();
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = solution.middleNode(head);
        assertEquals(2, result.val, "Middle of two elements list should be the second element.");
    }

    @Test
    void testMiddleNode_OddNumberOfElements() {
        MiddleOfTheLinkedList_876 solution = new MiddleOfTheLinkedList_876();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = solution.middleNode(head);
        assertEquals(3, result.val, "Middle of odd number of elements list should be the middle element.");
    }

    @Test
    void testMiddleNode_EvenNumberOfElements() {
        MiddleOfTheLinkedList_876 solution = new MiddleOfTheLinkedList_876();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode result = solution.middleNode(head);
        assertEquals(4, result.val, "Middle of even number of elements list should be the second middle element.");
    }

    @Test
    void testMiddleNode_EmptyList() {
        MiddleOfTheLinkedList_876 solution = new MiddleOfTheLinkedList_876();
        ListNode result = solution.middleNode(null);
        assertNull(result, "Middle of an empty list should be null.");
    }

    @Test
    void testMiddleNode_LongList() {
        MiddleOfTheLinkedList_876 solution = new MiddleOfTheLinkedList_876();
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 100; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        ListNode result = solution.middleNode(head);
        assertEquals(51, result.val, "Middle of a long list should be correctly identified.");
    }

}