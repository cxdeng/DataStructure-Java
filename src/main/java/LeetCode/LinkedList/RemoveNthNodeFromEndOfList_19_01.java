package LeetCode.LinkedList;

public class RemoveNthNodeFromEndOfList_19_01 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode(-1, head);
        remove(sentinel, n);
        return sentinel.next;
    }

    private int remove(ListNode p, int n) {
        if (p == null) {
            return 0;
        }

        // The next node's reciprocal position
        int nth = remove(p.next, n);
        if (nth == n) {
            p.next = p.next.next;
        }

        return nth + 1;
    }
}
