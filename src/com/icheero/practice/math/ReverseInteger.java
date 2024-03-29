package com.icheero.practice.math;

/**
 * 7. 整数反转
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例1:
 *
 * 输入: 123
 * 输出: 321
 * 示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 *
 * https://leetcode-cn.com/problems/reverse-integer
 */
public class ReverseInteger
{
    public static void main(String[] args) {
        System.out.println(solution(-1234));
    }
    public static int solution(int x)
    {
        long n = 0;
        while (x != 0)
        {
            n = n * 10 + x % 10;
            x /= 10;
        }
        return (int) n == n ? (int) n : 0;
    }
}
