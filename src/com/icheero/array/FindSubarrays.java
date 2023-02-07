package com.icheero.array;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/find-subarrays-with-equal-sum/">2395. 和相等的子数组</a>
 * <p>
 * 给你一个下标从 0 开始的整数数组 nums，判断是否存在两个长度为2的子数组且它们的和相等。
 * 注意，这两个子数组起始位置的下标必须不相同。
 * 如果这样的子数组存在，请返回true，否则返回false。
 * 子数组 是一个数组中一段连续非空的元素组成的序列。
 *
 * @author Work
 * @date 2023-02-07
 */
class FindSubArrays {
    static boolean solution(int[] nums) {
        boolean flag = false;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            int sum = nums[i] + nums[i - 1];
            if (map.containsKey(sum)) {
                flag = true;
                break;
            }
            map.put(sum, true);
        }
        return flag;
    }
}
