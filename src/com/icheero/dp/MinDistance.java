package com.icheero.dp;

/**
 * 72. 编辑距离
 *
 * 给你两个单词word1 和word2，请你计算出将word1转换成word2 所使用的最少操作数。
 *
 * 你可以对一个单词进行如下三种操作：
 *
 * 插入一个字符
 * 删除一个字符
 * 替换一个字符
 *
 * 示例1：
 *      输入：word1 = "horse", word2 = "ros"
 *      输出：3
 *      解释：
 *      horse -> rorse (将 'h' 替换为 'r')
 *      rorse -> rose (删除 'r')
 *      rose -> ros (删除 'e')
 *
 * 示例2：
 *      输入：word1 = "intention", word2 = "execution"
 *      输出：5
 *      解释：
 *      intention -> inention (删除 't')
 *      inention -> enention (将 'i' 替换为 'e')
 *      enention -> exention (将 'n' 替换为 'x')
 *      exention -> exection (将 'n' 替换为 'c')
 *      exection -> execution (插入 'u')
 *
 * https://leetcode-cn.com/problems/edit-distance
 */
public class MinDistance
{
    public static int solution(String word1, String word2)
    {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int j = 1; j <= m; j++)
            dp[j][0] = dp[j - 1][0] + 1;
        for (int i = 1; i <= n; i++)
            dp[0][i] = dp[0][i - 1] + 1;
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
            }
        }
        return dp[m][n];
    }
}
