package com.icheero.practice.array;

/**
 * 747. 至少是其他数字两倍的最大数
 *
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 *
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 *
 * 如果是，则返回最大元素的索引，否则返回-1。
 *
 * 示例 1:
 * 输入: nums = [3, 6, 1, 0]
 * 输出: 1
 * 解释: 6是最大的整数, 对于数组中的其他整数,
 * 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
 *
 *
 * 示例 2:
 * 输入: nums = [1, 2, 3, 4]
 * 输出: -1
 * 解释: 4没有超过3的两倍大, 所以我们返回 -1.
 *
 *
 * 提示:
 * nums的长度范围在[1, 50].
 * 每个nums[i]的整数范围在[0, 100].
 *
 * https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others
 */
public class DominantIndex
{
    public static int solution(int[] nums)
    {
        if (nums.length == 1)
            return 0;
        int max1 = 0; // 最大数字
        int max2 = -1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[max1] < nums[i])
            {
                max2 = max1;
                max1 = i;
            }
            else
            {
                if (max2 < 0)
                    max2 = i;
                if (nums[i] > nums[max2])
                    max2 = i;
            }
        }
        if (nums[max1] >= nums[max2] * 2)
            return max1;
        return -1;
    }
}
