package LeetCode.LinkedList;

public class PalindromeLinkedList_234_01 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode p1 = head;
        ListNode p2 = reverse(slow);

        while (p2 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }


    private ListNode reverse(ListNode p) {
        if (p == null || p.next == null) {
            return p;
        }

        ListNode lastNode = reverse(p.next);
        p.next.next = p;
        p.next = null;

        return lastNode;
    }
}
