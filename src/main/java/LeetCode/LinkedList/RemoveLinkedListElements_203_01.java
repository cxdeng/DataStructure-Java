package LeetCode.LinkedList;

public class RemoveLinkedListElements_203_01 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(-1, head);
        ListNode p1 = sentinel;
        ListNode p2 = sentinel.next;

        while (p2 != null) {
            if (p2.val == val) {
                p1.next = p2.next;
            } else {
                p1 = p1.next;
            }
            p2 = p2.next;
        }

        return sentinel.next;
    }
}
