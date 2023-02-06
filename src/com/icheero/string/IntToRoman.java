package com.icheero.string;

/**
 * <a href="https://leetcode.cn/problems/integer-to-roman/">12. 整数转罗马数字</a>
 * @author Work
 * @date 2023-02-06
 */
class IntToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(1));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(2994));
        System.out.println(intToRoman(894));
    }

    static String intToRoman(int num) {
        int[] ARR_NUM = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] ARR_STR = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ARR_NUM.length; i++) {
            int value = ARR_NUM[i];
            String str = ARR_STR[i];
            while (num >= value) {
                num -= value;
                builder.append(str);
            }
        }
        return builder.toString();
    }
}
