package com.icheero.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 169. 多数元素
 *
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * https://leetcode-cn.com/problems/majority-element
 */
public class MajorityElement
{
    /**
     * 利用HashMap 进行计数
     */
    public static int byMap(int[] nums)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
        {
            int n = map.getOrDefault(num, 0) + 1;
            if (n > nums.length / 2)
                return num;
            map.put(num, n);
        }
        return -1;
    }

    /**
     * 先进行排序，N/2 的元素一定为众数
     */
    public static int bySort(int[] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 摩尔投票法
     * 把众数记为 +1+1，把其他数记为 -1−1，将它们全部加起来
     * 显然和大于 0，从结果本身我们可以看出众数比其他数多
     * @param nums
     * @return
     */
    public static int byMooreVote(int[] nums)
    {
        int maj = 0;
        int count = 0;
        for (int num : nums)
        {
            if (num == nums[0])
                maj = nums[0];
            count += (num == maj) ? 1 : -1;
        }
        return maj;
    }
}
