package com.icheero.dp;

/**
 * 背包问题
 * 假设山洞里共有a,b,c,d ,e这5件宝物，它们的重量分别是2,2,6,5,4，它们的价值分别是6,3,5,4,6。
 * 现在给你个承重为10的背包, 怎么装背包，可以才能带走最多的财富
 */
public class Knapsack01
{
    public static int solution(int[] weights, int[] values, int v)
    {
        int n = weights.length; // n 种物品
        // 定义dp[i][j]，表示选择 i 件商品，容量为 j 时的最大价值
        int[][] dp = new int[n + 1][v + 1];
        // 背包重量为 0 时，最大价值为 0
        for (int i = 1; i <= n; i++)
            dp[i][0] = 0;
        // 选择物品数量为 0 时，最大价值为 0
        for (int j = 1; j <= v; j++)
            dp[0][j] = 0;

        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j <= v; j++)
            {
                if (j < weights[i - 1])
                    dp[i][j] = dp[i - 1][j];
                else // m[i-1][j],m[i-1][j-w[i]]+v[i]
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
            }
        }
        return dp[n][v];
    }
}
