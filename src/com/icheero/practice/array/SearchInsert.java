package com.icheero.practice.array;

/**
 * <a href="https://leetcode.cn/problems/search-insert-position">35. 搜索插入位置</a>
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * @author Work
 * @date 2023-02-14
 */
class SearchInsert {
    // [1,3,5,6], target = 2
    public int searchInsert(int[] nums, int target) {
        int ret = 0;
        for (int num : nums) {
            if (num == target) {
                return ret;
            } else if (num > target) {
                return ret;
            }
            ret++;
        }
        return ret;
    }
}
