package com.icheero.practice.linked;

/**
 * <a href="https://leetcode.cn/problems/merge-in-between-linked-lists/">1669. 合并两个链表</a>
 *
 * @author Work
 * @date 2023-01-30
 */
public class MergeInBetween {
    public static ListNode solution(ListNode list1, int a, int b, ListNode list2) {
        ListNode nodeA = list1;
        for (int i = 0; i < a - 1; i++) {
            nodeA = nodeA.next;
        }
        ListNode nodeB = nodeA.next;
        for (int i = a; i < b; i++) {
            nodeB = nodeB.next;
        }
        nodeB = nodeB.next;
        ListNode tail = list2;
        while (tail.next != null) {
            tail = tail.next;
        }
        nodeA.next = list2;
        tail.next = nodeB;
        return list1;
    }
}
