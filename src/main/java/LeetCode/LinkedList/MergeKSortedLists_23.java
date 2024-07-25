package LeetCode.LinkedList;

public class MergeKSortedLists_23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        return split(lists, 0, lists.length - 1);
    }

    /**
     * @param lists
     * @param left  left bound
     * @param right right bound
     * @return Return the merged linked list
     */
    private ListNode split(ListNode[] lists, int left, int right) {
        // There is only one linked list in the array
        if (left == right) {
            return lists[left];
        }

        int mid = left + (right - left) / 2;
        ListNode leftList = split(lists, left, mid);
        ListNode rightList = split(lists, mid + 1, right);

        return mergeTwoLists(leftList, rightList);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode sentinel = new ListNode(-1, null);
        ListNode p = sentinel;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        if (p1 == null) {
            p.next = p2;
        } else {
            p.next = p1;
        }

        return sentinel.next;
    }
}
