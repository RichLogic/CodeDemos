package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Subject002 {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 看错题了，跟翻转链表没有任何鸡毛关系😤
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode guard = new ListNode(0);
        this.recurseAdd(l1, l2, guard, 0);
        return guard.next;
    }

    void recurseAdd(ListNode r1, ListNode r2, ListNode sum, int carry) {

        if (r1 == null && r2 == null && carry == 0)
            return;

        ListNode n1 = null;
        ListNode n2 = null;
        int a=0, b=0, c, d=0;

        if (r1 != null) {
            a = r1.val;
            n1 = r1.next;
        }
        if (r2 != null) {
            b = r2.val;
            n2 = r2.next;
        }

        c = a + b + carry;
        if (c > 9) {
            c -= 10;
            d = 1;
        }

        sum.next = new ListNode(c);
        recurseAdd(n1, n2, sum.next, d);
    }

    // 迭代：空间复杂度 O(1) 时间复杂度 O(n)
    ListNode iterateReverse(ListNode origin) {

        ListNode current = origin;
        ListNode next = current.next;
        ListNode head = null;

        while (next != null) {
            next = current.next;
            current.next = head;
            head = current;
            current = next;
        }

        return head;
    }

    // 递归：空间复杂度 O(n) 时间复杂度 O(n)
    ListNode recurseReverse(ListNode head, ListNode current) {

        ListNode next = current.next;
        current.next = head;

        if (next == null)
            return current;
        else
            return recurseReverse(current, next);
    }

    // 额外弄了一个数组：空间复杂度 O(n) 时间复杂度 O(2n)
    ListNode reverseLinkedList(ListNode node) {
        List<ListNode> tempList = new ArrayList<>();
        addArray(tempList, node);

        int length = tempList.size();
        ListNode head = tempList.get(length - 1);
        pollArray(tempList, head, length - 1);

        return head;
    }

    private void addArray(List<ListNode> tempList, ListNode node) {
        tempList.add(node);
        if (node.next != null)
            addArray(tempList, node.next);
    }

    private void pollArray(List<ListNode> tempList, ListNode node, int i) {

        if (i > 0) {
            node.next = tempList.get(i-1);
            pollArray(tempList, node.next, --i);
        } else {
            node.next = null;
        }

    }

}

