package LeetCode.LinkedList;

public class RemoveLinkedListElements_203_02 {
    public ListNode removeElements(ListNode p, int val) {
        if (p == null) {
            return null;
        }

        if (p.val == val) {
            return removeElements(p.next, val);
        } else {
            p.next = removeElements(p.next, val);
            return p;
        }
    }
}
