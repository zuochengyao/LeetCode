package com.icheero.sort;

/**
 * ѡ������
 */
public class Selection
{
    /**
     * Title: ѡ�������е�ֱ��ѡ�����������ڳ�ʼ����
     * Description: ÿһ�� (�����i�ˣ�i = 0,1,...)�ں����n-i��������Ԫ����ѡ����СԪ����Ϊ�������еĵ�i��Ԫ��
     * ʱ�临�Ӷȣ��������O(n^2)��ƽ������O(n^2)���������O(n^2)
     * �ռ临�Ӷȣ�O(1)
     * �ȶ��ԣ����ȶ�
     * �ڲ�����(���������������Ԫ����ȫ���ڴ�)
     */
    static int[] straight(int[] target)
    {
        if (target == null || target.length == 0)
            return target;
        for (int i = 0; i < target.length; i++)
        {
            int min = i;
            for (int j = i + 1; j < target.length; j++)
            {
                if (target[j] < target[min])
                    min = j;
            }
            if (target[min] != target[i])
                SortUtil.swap(target, i, min);
        }
        return target;
    }

    private static int[] heap(int[] target)
    {
        return target;
    }

}
