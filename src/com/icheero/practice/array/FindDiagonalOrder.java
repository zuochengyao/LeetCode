package com.icheero.practice.array;

/**
 * 498. 对角线遍历
 *
 * 给定一个含有 M x N 个元素的矩阵（M 行，N 列），
 * 请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
 *
 * 示例:
 *
 * 输入:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 *
 * 输出:  [1,2,4,7,5,3,6,8,9]
 *
 * 解释: https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/diagonal_traverse.png
 *
 * 说明: 给定矩阵中的元素总数不会超过 100000
 *
 * https://leetcode-cn.com/problems/diagonal-traverse
 */
public class FindDiagonalOrder
{
    /**
     * 思路：
     *
     * 根据每个元素下标判断
     * 下标和为偶数：右上
     * 下标和为奇数：左下
     *
     * 同时再移动的时候，判断边界是否可移。
     */
    public static int[] solution(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[]{ };
        int m = matrix.length; // 行
        int n = matrix[0].length; // 列
        int[] ret = new int[m * n];
        int row = 0, col = 0;
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = matrix[row][col];
            // 右上移动
            if ((row + col) % 2 == 0)
            {
                // 无法右移
                if (col == n - 1)
                    row++; // 向下移动
                else if (row == 0) // 可以右移 && 在第一行（不能上移）
                    col++; // 右移
                else // 可以右下移
                {
                    row--; // 上
                    col++; // 右
                }
            }
            else // 左下
            {
                if (row == m - 1) // 无法下移
                    col++; // 右移
                else if (col == 0) // 可以下移 && 在第一列（不能左移）
                    row++; // 下移
                else //
                {
                    row++; // 下
                    col--; // 左
                }
            }

        }
        return ret;
    }


}
