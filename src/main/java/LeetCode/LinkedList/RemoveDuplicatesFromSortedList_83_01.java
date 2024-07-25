package LeetCode.LinkedList;

public class RemoveDuplicatesFromSortedList_83_01 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2 != null) {
            if (p1.val == p2.val) {
                p1.next = p2.next;
            } else {
                p1 = p1.next;
            }
            p2 = p1.next;
        }

        return head;
    }
}
