package com.icheero.leetcode.array;

/**
 * 66. 加一
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 示例 2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * https://leetcode-cn.com/problems/plus-one
 */
public class PlusOne
{
    public static int[] solution(int[] digits)
    {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--)
        {
            //非9加1
            if (digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            //逢9置0
            digits[i] = 0;
        }
        //全部为9，则需要数组扩充1位
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
