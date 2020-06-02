package com.icheero.sort;

public class SortUtil
{
    public static int[] selectStraight(int[] target)
    {
        return Selection.straight(target);
    }

    public static int[] insertStraight(int[] target)
    {
        return Insert.straight(target);
    }

    static void swap(int[] target, int a, int b)
    {
        int temp = target[b];
        target[b] = target[a];
        target[a] = temp;
    }
}
