package com.icheero.math;

/**
 * 43. 字符串相乘
 *
 * 给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
 *
 * 示例 1:
 *
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 示例2:
 *
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * 说明：
 *
 * num1和num2的长度小于110。
 * num1 和num2 只包含数字0-9。
 * num1 和num2均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 *
 * https://leetcode-cn.com/problems/multiply-strings
 */
public class Multiply
{
    public static String solution(String num1, String num2)
    {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        String res = "0";
        for (int i = num1.length() - 1; i >= 0; i--)
        {
            StringBuilder builder = new StringBuilder();
            int carry = 0;
            int a = num1.charAt(i) - '0';
            for (int k = i; k < num1.length() - 1; k++)
                builder.append(0);
            for (int j = num2.length() - 1; j >= 0 || carry > 0; j--)
            {
                int b = j >= 0 ? num2.charAt(j) - '0' : 0;
                int c = a * b + carry;
                carry = c / 10;
                builder.append(c % 10);
            }
            String str = builder.reverse().toString();
            res = strAdd(res, str);
        }
        return res;
    }

    private static String strAdd(String num1, String num2)
    {
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry > 0; i--, j--)
        {
            int a = i >= 0 ? num1.charAt(i) - '0' : 0;
            int b = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = a + b + carry;
            carry = sum / 10;
            builder.append(sum % 10);
        }
        return builder.reverse().toString();
    }
}
