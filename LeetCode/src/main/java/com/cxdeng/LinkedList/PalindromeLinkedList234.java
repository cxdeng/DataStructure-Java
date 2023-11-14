package com.cxdeng.LinkedList;

public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        ListNode low = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
        }

        ListNode l1 = head;
        ListNode l2 = reverseList(low);

        while (l1 != low && l2 != null){
            if (l1.val != l2.val){
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode p) {
        if (p == null || p.next == null) {
            return p;
        }


        ListNode lastNode = reverseList(p.next);
        p.next.next = p;
        p.next = null;

        return lastNode;
    }
}
