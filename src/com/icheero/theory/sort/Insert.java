package com.icheero.theory.sort;

class Insert {
    /**
     * 直接插入排序
     *
     * Title: 选择排序中的直接选择排序，依赖于初始序列
     * Description: 每一趟 (例如第i趟，i = 0,1,...)在后面第n-i个待排序元素中选出最小元素作为有序序列的第i个元素
     * 时间复杂度：最好情形O(n^2)，平均情形O(n^2)，最差情形O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * 内部排序(在排序过程中数据元素完全在内存)
     */
    static void straight(int[] target) {
        if (target == null || target.length == 0)
            return;
        for (int i = 1; i < target.length; i++) {
            for (int j = i; j > 0; j--) {
                if (target[j] < target[j - 1])
                    SortUtil.swap(target, j, j - 1);
            }
        }
    }

    /**
     * 希尔排序
     *
     * Title: 插入排序中的希尔排序，依赖于初始序列
     * Description: 分别对间隔为gap的gap个子序列进行【直接插入排序】，不断缩小gap,直至为 1
     * 刚开始时，gap较大，每个子序列元素较少，排序速度较快；
     * 待到排序后期，gap变小，每个子序列元素较多，但大部分元素基本有序，所以排序速度仍较快。
     * 时间复杂度：O(n) ~ O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * 内部排序(在排序过程中数据元素完全在内存)
     */
    static void shell(int target) {

    }
}
