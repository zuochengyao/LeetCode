package com.icheero.practice.dp;

import java.util.Scanner;

public class Knapsack
{
    static int[] w = new int[6];//每件物品的重量
    static int[] v = new int[6];//每件物品的价值

    public static void solution()
    {
        int[][] temp = new int[6][11];//8表示背包最多能放8公斤的重量
        for (int j = 0; j < 11; j++)
        {//初始化每一行
            temp[0][j] = 0;
        }
        for (int i = 1; i < 6; i++)
        {//背包重量为0时，最大价值肯定是0
            temp[i][0] = 0;
        }

        for (int i = 1; i < 6; i++)
        {//从第一个物品开始选，记录我选了前面出现的物品，背包重量从1-8的能选上的最大值
            for (int j = 1; j < 11; j++)
            {//当i循环到最后一层6的时候，也就是得到了，我6件物品都选上的时候的最大值
                if (w[i - 1] <= j)
                {//重量比这个状态小，那么就能放。就是放与不放的问题，观察室放重量大还是不放重量大
                    temp[i][j] = Math.max(temp[i - 1][j], temp[i - 1][j - w[i - 1]] + v[i - 1]);
                }
                else
                {
                    temp[i][j] = temp[i - 1][j];//第i件物品不能放
                }
            }
        }
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 11; j++)
            {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("请依次输入重量和价值:");
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            w[i] = scn.nextInt();//输入重量
            v[i] = scn.nextInt();//输入价值
        }
        solution();
        // temp[i][j] = Math.max(temp[i-1][j], temp[i-1][j-w[i]]+v[i]);
        // m[i][j]= Math.max(m[i-1][j],m[i][j-w[i-1]]+v[i-1]);

    }
}