package com.icheero.linked;

/**
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的升序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoLists
{

    public static ListNode solution()
    {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(6);

        return solution(l1, l2);
    }

    private static ListNode solution(ListNode l1, ListNode l2)
    {
        ListNode node = new ListNode(-1);
        ListNode current = node;
        while (l1 != null && l2 != null)
        {
            if (l1.val >= l2.val)
            {
                current.next = l2;
                l2 = l2.next;
            }
            else
            {
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }
        current.next = l1 == null ? l2 : l1;
        return node.next;
    }

    private static class ListNode
    {
        int val;
        ListNode next;

        ListNode()
        {
        }

        ListNode(int val)
        {
            this.val = val;
        }

        ListNode(int val, ListNode next)
        {
            this.val = val;
            this.next = next;
        }
    }
}
