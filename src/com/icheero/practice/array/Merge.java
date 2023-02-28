package com.icheero.practice.array;

/**
 * <a href="https://leetcode.cn/problems/merge-sorted-array/">88. 合并两个有序数组</a>
 * <p>
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * @author Work
 * @date 2023-02-13
 */
class Merge {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;
        while (i >= 0) {
            if (j < 0 || nums2[i] > nums1[j]) {
                nums1[k--] = nums2[i--];
            } else {
                nums1[k--] = nums1[j--];
            }
        }
    }
}
