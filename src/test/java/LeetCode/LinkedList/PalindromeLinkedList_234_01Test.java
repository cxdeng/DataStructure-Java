package LeetCode.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedList_234_01Test {

    @Test
    void testEmptyList() {
        ListNode head = null;
        PalindromeLinkedList_234_01 solution = new PalindromeLinkedList_234_01();
        assertTrue(solution.isPalindrome(head), "Empty list should be palindrome");
    }

    @Test
    void testSingleElementList() {
        ListNode head = new ListNode(1);
        PalindromeLinkedList_234_01 solution = new PalindromeLinkedList_234_01();
        assertTrue(solution.isPalindrome(head), "Single element list should be palindrome");
    }

    @Test
    void testEvenLengthPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        PalindromeLinkedList_234_01 solution = new PalindromeLinkedList_234_01();
        assertTrue(solution.isPalindrome(head), "List 1 -> 2 -> 2 -> 1 should be palindrome");
    }

    @Test
    void testEvenLengthNonPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        PalindromeLinkedList_234_01 solution = new PalindromeLinkedList_234_01();
        assertFalse(solution.isPalindrome(head), "List 1 -> 2 -> 3 should not be palindrome");
    }

    @Test
    void testOddLengthPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        PalindromeLinkedList_234_01 solution = new PalindromeLinkedList_234_01();
        assertTrue(solution.isPalindrome(head), "List 1 -> 2 -> 3 -> 2 -> 1 should be palindrome");
    }

    @Test
    void testOddLengthNonPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);
        PalindromeLinkedList_234_01 solution = new PalindromeLinkedList_234_01();
        assertFalse(solution.isPalindrome(head), "List 1 -> 2 -> 3 -> 4 -> 2 -> 1 should not be palindrome");
    }

}