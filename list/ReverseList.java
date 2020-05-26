public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode (int x) {val = x;};
    }
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    public static ListNode reverse(ListNode head, ListNode newHead) {
        if (head == null) return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverse(next, head);
    }

}
