package com.icheero.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 884. 两句话中的不常见单词
 *
 * 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
 * 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
 * 返回所有不常用单词的列表。您可以按任何顺序返回列表。
 *
 * 示例 1：
 * 输入：A = "this apple is sweet", B = "this apple is sour"
 * 输出：["sweet","sour"]
 *
 * 示例 2：
 * 输入：A = "apple apple", B = "banana"
 * 输出：["banana"]
 *
 * https://leetcode-cn.com/problems/uncommon-words-from-two-sentences
 */
public class UncommonFromSentences
{
    public static String[] solution(String A, String B)
    {
        Map<String, Integer> count = new HashMap<>();
        String C = A.trim() + " " + B.trim();
        for (String word: C.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);
        List<String> ans = new LinkedList<>();
        for (String word: count.keySet())
            if (count.get(word) == 1)
                ans.add(word);

        return ans.toArray(new String[0]);
    }
}
