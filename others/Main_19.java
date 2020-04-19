
// publ给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

// 示例：

// 给定一个链表: 1->2->3->4->5, 和 n = 2.

// 当删除了倒数第二个节点后，链表变为 1->2->3->5.

class Main_19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(x) {val = x;}
    }
    public ListNode deleteNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }

}

// reverse list
class Main{
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public ListNode reverseList(ListNode head) {
        return func(head, null);
    }

    private ListNode func(ListNode head, ListNode newHead) {
        if (head == null) return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return func(next, head);

    }
}

// merger ListNode
class Main {
    public ListNode meregeTwoLists(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        ListNode newhead;
        if (head1.val < head2.val) {
            head1.next = meregeTwoLists(head1.next, head2);
            return head1;
        } else {
            head2.next = meregeTwoLists(head1, head2.next);
            return head2;
        }
    }
}

// has cycle
class Main {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        if (head.next == head) return true;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
