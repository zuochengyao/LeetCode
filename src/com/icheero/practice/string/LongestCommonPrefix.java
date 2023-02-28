package com.icheero.practice.string;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 提示：
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 *
 * https://leetcode.cn/problems/longest-common-prefix/
 *
 * @author Work
 * @date 2022-09-14
 */
public class LongestCommonPrefix {
    public static String solution(String[] strs) {
        String ret = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() == 0)
                return "";
            char[] chars = strs[i].toCharArray();
            int index = 0;

            int len = Math.min(ret.length(), chars.length);

            for (int j = 0; j < len; j++) {
                if (chars[j] == ret.charAt(j)) {
                    index++;
                } else {
                    break;
                }
            }
            ret = ret.substring(0, index);
        }
        return ret;
    }

    public static String solutionBetter(String[] strs) {
        //公共前缀比所有字符串都短，随便选一个先
        String s = strs[0];
        for (String string : strs) {
            while (!string.startsWith(s)) {
                //公共前缀不匹配就让它变短！
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }
}
