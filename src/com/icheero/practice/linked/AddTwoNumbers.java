package com.icheero.practice.linked;

/**
 * 2. 两数相加
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0开头。
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */

public class AddTwoNumbers
{
    public static ListNode solution()
    {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        return solution(l1, l2);
    }

    private static ListNode solution(ListNode l1, ListNode l2)
    {
        int carry = 0;
        ListNode sumNode = new ListNode(0);
        ListNode currentNode = sumNode;
        while (l1 != null || l2 != null)
        {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum = carry + v1 + v2;
            carry = sum >= 10 ? 1 : 0;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry > 0)
            currentNode.next = new ListNode(carry);
        return sumNode.next;
    }

    static class ListNode
    {
        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }

        @Override
        public String toString()
        {
            ListNode next = this.next; // 不写这个，在debug模式下，结果会不同。
            StringBuilder builder = new StringBuilder("[").append(val);
            while (next != null)
            {
                builder.append(",").append(next.val);
                next = next.next;
            }
            return builder.append("]").toString();
        }
    }
}


