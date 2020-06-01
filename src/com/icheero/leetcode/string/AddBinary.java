package com.icheero.leetcode.string;

/**
 * 67. 二进制求和
 *
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *  
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *  
 *
 * 提示：
 *
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 *
 * https://leetcode-cn.com/problems/add-binary
 */
public class AddBinary
{
    public static String solution(String a, String b)
    {
        StringBuilder ret = new StringBuilder();
        char[] num1 = a.toCharArray();
        char[] num2 = b.toCharArray();
        int carry = 0;

        for (int i = num1.length - 1, j = num2.length - 1; i >= 0 || j >= 0; i--, j--)
        {
            int sum = carry;
            sum += i >= 0 ? num1[i] - '0' : 0;
            sum += j >= 0 ? num2[j] - '0' : 0;
            ret.append(sum % 2);
            carry = sum / 2;
        }
        if (carry == 1)
            ret.append(1);
        return ret.reverse().toString();
    }
}
