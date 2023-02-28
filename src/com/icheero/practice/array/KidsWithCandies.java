package com.icheero.practice.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431. 拥有最多糖果的孩子
 *
 * 给你一个数组candies和一个整数extraCandies，其中candies[i]代表第 i 个孩子拥有的糖果数目。
 * 对每一个孩子，检查是否存在一种方案，将额外的extraCandies个糖果分配给孩子们之后，此孩子有 最多的糖果。注意，允许有多个孩子同时拥有 最多的糖果数目。
 * 
 * 示例 1：
 * 输入：candies = [2,3,5,1,3], extraCandies = 3
 * 输出：[true,true,true,false,true]
 * 示例 2：
 * 输入：candies = [4,2,1,1,2], extraCandies = 1
 * 输出：[true,false,false,false,false]
 *
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies
 */
public class KidsWithCandies
{
    public static List<Boolean> solution(int[] candies, int extraCandies)
    {
        if (candies == null || candies.length == 0)
            return null;
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies)
            max = Math.max(max, candy);
        for (int candy : candies)
        {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
