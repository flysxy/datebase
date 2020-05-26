public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;};
    }
    public ListNode mergerTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergerTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergerTwoLists(l1, l2.next);
            return l2;
        }
    }

}