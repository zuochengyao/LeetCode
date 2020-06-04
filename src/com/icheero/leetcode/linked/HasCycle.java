package com.icheero.leetcode.linked;

/**
 * 141. 环形链表
 *
 * 给定一个链表，判断链表中是否有环。
 */
public class HasCycle
{
    public static boolean solution()
    {
        ListNode node = new ListNode();
        node.next = new ListNode();
        node.next.next = new ListNode();
        node.next.next.next = new ListNode();
        node.next.next.next.next = node.next;
        return solution(node);
    }

    private static boolean solution(ListNode head)
    {
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast)
                return true;
        }
        return false;
    }

    private static class ListNode
    {
        ListNode next;
    }
}
