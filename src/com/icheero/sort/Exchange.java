package com.icheero.sort;

class Exchange
{
    /**
     * 冒泡排序
     *
     * Title: 交换排序中的冒泡排序 ，一般情形下指的是优化后的冒泡排序，最多进行n-1次比较，依赖于初始序列
     * Description:因为越大的元素会经由交换慢慢"浮"到数列的顶端(最后位置)，最大的数最后才确定下来，所以称为冒泡排序
     * 时间复杂度：最好情形O(n)，平均情形O(n^2)，最差情形O(n^2)
     * 空间复杂度：O(1)
     * 稳 定 性：稳定
     * 内部排序(在排序过程中数据元素完全在内存)
     */
    static void bubble(int[] target)
    {
        if (target != null && target.length > 0)
        {
            for (int i = 0; i < target.length - 1; i++)
            {
                for (int j = 0; j < target.length - i - 1; j++)
                {
                    if (target[j] > target[j + 1])
                        SortUtil.swap(target, j, j +  1);
                }
            }
        }
    }
}
