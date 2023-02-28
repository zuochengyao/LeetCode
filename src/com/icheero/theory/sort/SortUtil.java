package com.icheero.theory.sort;

public class SortUtil
{
    public static void selectStraight(int[] target)
    {
        Selection.straight(target);
    }

    public static void insertStraight(int[] target)
    {
        Insert.straight(target);
    }

    public static void bubble(int[] target)
    {
        Exchange.bubble(target);
    }

    public static void quick(int[] target)
    {
        Exchange.quick(target, 0, target.length - 1);
    }

    static void swap(int[] target, int a, int b)
    {
        int temp = target[b];
        target[b] = target[a];
        target[a] = temp;
    }
}
