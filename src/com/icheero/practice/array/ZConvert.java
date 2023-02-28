package com.icheero.practice.array;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/zigzag-conversion/">6. Z 字形变换</a>
 */
public class ZConvert {
    /**
     * "PAYPALISHIRING" 行数为 3,len = 14
     */
    public static String solution(String s, int numRows) {
        if (numRows < 2)
            return s;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int i = 0;
        boolean flag = true;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0) {
                flag = true;
            }
            if (i == numRows - 1) {
                flag = false;
            }
            i = flag ? i + 1 : i - 1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}
