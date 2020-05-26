public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val=x;};
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int num = x + y  + carry;
            carry = num / 10;
            num = num%10;
            cur.next = new ListNode(num);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) cur.next = new ListNode(carry);
        return pre.next;
    }

}


// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
// 输出：7 -> 0 -> 8
// 原因：342 + 465 = 807

// code details, please checking below
// carry   L1: 6 4 2
//         L2: 4 6 7

// pre ：cur : 0 1 0
// carry val : 1 1 1
