package com.icheero.dp;

/**
 * 背包问题
 *
 * 假设山洞里共有a,b,c,d ,e这5件宝物，它们的重量分别是2,2,6,5,4，它们的价值分别是6,3,5,4,6。
 * 现在给你个承重为10的背包, 怎么装背包，可以才能带走最多的财富
 */
public class Knapsack01
{
    public static void solution(int[] weights, int[] values, int v)
    {
        int m = weights.length; // 数量
        int[][] dp = new int[m + 1][v + 1];
        for (int i = 1; i <= m; i++)
        {
            dp[i][0] = dp[i - 1][0] + values[i];
        }
    }
}
