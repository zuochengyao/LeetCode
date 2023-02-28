package com.icheero.practice.list;

import java.util.Stack;

/**
 * <a href="https://leetcode.cn/problems/implement-queue-using-stacks">232. 栈实现队列</a>
 * <p>
 * void push(int x) 将元素 x 推到队列的末尾
 * <p>
 * int pop() 从队列的开头移除并返回元素
 * <p>
 * int peek() 返回队列开头的元素
 * <p>
 * boolean empty() 如果队列为空，返回 true ；否则，返回 false
 *
 * @author Work
 * @date 2023-02-20
 */
class Stack2Queue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}
