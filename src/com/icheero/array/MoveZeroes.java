package com.icheero.array;

/**
 * 283. �ƶ���
 *
 * ����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
 *
 * ʾ��:
 *
 * ����: [0,1,0,3,12]
 * ���: [1,3,12,0,0]
 * ˵��:
 *
 * ������ԭ�����ϲ��������ܿ�����������顣
 * �������ٲ���������
 *
 * https://leetcode-cn.com/problems/move-zeroes
 */
public class MoveZeroes
{
    public static void solution(int[] nums)
    {
        int cur = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                if (cur != i)
                {
                    int tmp = nums[i];
                    nums[i] = nums[cur];
                    nums[cur++] = tmp;
                }
                else
                    cur++;
            }
        }
    }

}
