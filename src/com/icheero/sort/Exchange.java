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

    /**
     * 快排序
     *
     * Title: 交换排序中的快速排序，目前应用最为广泛的排序算法，是一个递归算法，依赖于初始序列
     * Description:快速排序包括两个过程：划分 和 快排
     * "划分"是指将原序列按基准元素划分两个子序列
     * "快排"是指分别对子序列进行快排
     *
     * 就平均计算时间而言，快速排序是所有内部排序方法中最好的一个
     *
     * 对大规模数据排序时，快排是快的；对小规模数据排序时，快排是慢的，甚至慢于简单选择排序等简单排序方法
     *
     * 快速排序依赖于原始序列，因此其时间复杂度从O(nlgn)到O(n^2)不等
     * 时间复杂度：最好情形O(nlgn)，平均情形O(nlgn)，最差情形O(n^2)
     *
     * 递归所消耗的栈空间
     * 空间复杂度：O(lgn)
     *
     * 可选任一元素作为基准元素
     * 稳 定 性：不稳定
     */
    static void quick(int[] target, int low, int high)
    {
        if (low < high)
        {
            int base = getBase(target, low, high);
            quick(target, low, base - 1);
            quick(target, base + 1, high);
        }
    }

    private static int getBase(int[] target, int low, int high)
    {
        int base = target[low];
        while (low < high)
        {
            while (low < high && target[high] >= base)
                high--;
            target[low] = target[high];
            while (low < high && target[low] <= base)
                low++;
            target[high] = target[low];
        }
        target[low] = base;
        return low;
    }
}
