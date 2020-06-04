package com.icheero.math;

import java.util.HashMap;
import java.util.Map;

/**
 * 13.罗马数字转整数
 *
 * 罗马数字包含以下七种字符: I(1)，V(5)，X(10)，L(50)，C(100)，D(500) 和 M(1000)
 * 罗马数字中小的数字在大的数字的右边。但也存在特例:
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * "MCMXCIV" = 1994
 *
 * https://leetcode-cn.com/problems/roman-to-integer/
 */
public class RomanToInteger
{
    public static int solution(String s)
    {
        int num = 0;
        // char[] code = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        char[] chars = s.toCharArray();
        if (chars.length == 1)
            num = romanMap.get(chars[0]);
        else
        {
            for (int i = 0; i < chars.length; i++)
            {
                if (i + 1 == chars.length) // 最后一位
                    num += romanMap.get(chars[i]);
                else
                {
                    if (romanMap.get(chars[i]) < romanMap.get(chars[i + 1]))
                    {
                        num += (romanMap.get(chars[i + 1]) - romanMap.get(chars[i]));
                        i++;
                    }
                    else
                        num += romanMap.get(chars[i]);
                }
            }
        }
        return num;
    }
}
