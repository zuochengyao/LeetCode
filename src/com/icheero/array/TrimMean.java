package com.icheero.array;

import java.util.Arrays;

/**
 * 1619. 删除某些元素后的数组均值。
 * 给你一个整数数组 arr ，请你删除最小 5% 的数字和最大 5% 的数字后，剩余数字的平均值。
 * 与 标准答案 误差在 10-5 的结果都被视为正确结果。
 *
 * 提示
 * 20 <= arr.length <= 1000
 * arr.length 是 20 的 倍数
 * 0 <= arr[i] <= 105
 *
 * <a href="https://leetcode.cn/problems/mean-of-array-after-removing-some-elements/">code</a>
 *
 * @author Work
 * @date 2022-09-14
 */
public class TrimMean {
    public double solution(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        // SortUtil.quick(arr);
        Arrays.sort(arr);
        int sum = 0;
        for (int i = arr.length / 20; i < arr.length * 19 / 20; i++) {
            sum += arr[i];
        }
        return sum / (arr.length * 0.9);
    }
}
