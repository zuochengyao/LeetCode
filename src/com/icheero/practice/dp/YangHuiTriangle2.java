package com.icheero.practice.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/pascals-triangle/">119. 杨辉三角2</a>
 * <p>
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 *
 * @author Work
 * @date 2023-02-09
 */
class YangHuiTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        long cur = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) cur);
            cur = cur * (rowIndex - i) / (i + 1);
        }
        return res;
    }
    // 1                0
    // 1 1              1
    // 1 2 1            2
    // 1 3 3 1          3
    // 1 4 6 4 1        4
    // 1 5 10 10 5 1    5
}
