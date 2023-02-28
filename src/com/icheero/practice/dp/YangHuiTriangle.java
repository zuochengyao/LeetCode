package com.icheero.practice.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/pascals-triangle/">118. 杨辉三角</a>
 * <p>
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 *
 * @author Work
 * @date 2023-02-09
 */
class YangHuiTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> currentLine = new ArrayList<>();
        currentLine.add(1);
        result.add(currentLine);
        int[][] num = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            num[i][0] = 1;
        }

        for (int i = 1; i < numRows; i++) {
            currentLine = new ArrayList<>();
            currentLine.add(1);
            for (int j = 1; j <= i; j++) {
                num[i][j] = num[i - 1][j - 1] + num[i - 1][j];
                currentLine.add(num[i][j]);
            }
            result.add(currentLine);
        }
        return result;
    }
}
