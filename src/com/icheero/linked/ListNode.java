package com.icheero.linked;

/**
 * @author Work
 * @date 2023-01-30
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() { }

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
