package leetcode.medium;

import org.junit.Test;
import leetcode.medium.Subject002.*;

public class Subject002Test {

    Subject002 subject = new Subject002();

    @Test
    public void testReverse() {

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(6);
        ListNode a7 = new ListNode(7);
        ListNode a8 = new ListNode(8);
        ListNode a9 = new ListNode(9);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        a7.next = a8;
        a8.next = a9;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;

        this.foreachPrint(a1);
        System.out.println();
//        this.foreachPrint(b1);
//        System.out.println();
        System.out.println("--------------------");
//        this.foreachPrint(subject.addTwoNumbers(a1, b1));
        this.foreachPrint(subject.iterateReverse(a1));
    }

    private void foreachPrint(Subject002.ListNode node) {
        System.out.print(node.val + " ");
        if (node.next != null)
            foreachPrint(node.next);
    }

}
