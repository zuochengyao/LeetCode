package com.icheero.practice.array;

/**
 * 27. 移除元素
 * <p>
 * 难度：简单
 * <p>
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 链接：<a href="https://leetcode.cn/problems/remove-element">移除元素</a>
 *
 * @date 2023-01-25
 */
public class RemoveElement {
    public static int solution(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
