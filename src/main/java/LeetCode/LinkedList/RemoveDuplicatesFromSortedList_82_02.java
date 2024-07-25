package LeetCode.LinkedList;

public class RemoveDuplicatesFromSortedList_82_02 {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode sentinel = new ListNode(-1, head);
        ListNode p1 = sentinel;
        ListNode p2 = p1.next;
        ListNode p3 = p2.next;

        while (p2 != null && p3 != null) {
            if (p2.val == p3.val) {
                while (p3 != null && p3.val == p2.val) {
                    p3 = p3.next;
                }
                p1.next = p3;
            } else {
                p1 = p1.next;
            }
            p2 = p1.next;
            p3 = (p2 != null) ? p2.next : null;
        }

        return sentinel.next;
    }
}
