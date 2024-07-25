package LeetCode.LinkedList;

public class RemoveNthNodeFromEndOfList_19_02 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode(-1, head);

        ListNode p1 = sentinel;
        ListNode p2 = sentinel;

        for (int i = 0; i < n + 1; i++) {
            p2 = p2.next;
        }

        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p1.next = p1.next.next;

        return sentinel.next;
    }
}
