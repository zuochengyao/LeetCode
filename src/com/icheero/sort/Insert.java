package com.icheero.sort;

class Insert
{
    /**
     * ֱ�Ӳ�������
     *
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
        for (int i = 1; i < target.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (target[j] < target[j - 1])
                    SortUtil.swap(target, j, j - 1);
            }
        }
        return target;
    }
}
