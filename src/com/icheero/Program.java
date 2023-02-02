package com.icheero;

import com.icheero.array.RemoveElement;
import com.icheero.dp.Knapsack01;
import com.icheero.dp.MinDistance;
import com.icheero.dp.MinPathSum;
import com.icheero.dp.UniquePaths;
import com.icheero.array.BinarySearch;
import com.icheero.array.DominantIndex;
import com.icheero.array.FindDiagonalOrder;
import com.icheero.array.KidsWithCandies;
import com.icheero.array.MajorityElement;
import com.icheero.array.MoveZeroes;
import com.icheero.array.PivotIndex;
import com.icheero.array.PlusOne;
import com.icheero.linked.AddTwoNumbers;
import com.icheero.linked.HasCycle;
import com.icheero.linked.MergeTwoLists;
import com.icheero.math.Multiply;
import com.icheero.math.ReverseInteger;
import com.icheero.math.RomanToInteger;
import com.icheero.string.AddBinary;
import com.icheero.string.LengthOfLongestSubstring;
import com.icheero.string.LongestCommonPrefix;
import com.icheero.string.UncommonFromSentences;
import com.icheero.sort.SortUtil;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Program {
    public static void main(String[] args) {

    }

    // region Array
    private static void plusOne() {
        int[] array = PlusOne.solution(new int[] {9, 9, 9, 9});
        System.out.println(Arrays.toString(array));
    }

    private static void findDiagonalOrder() {
        int[] array = FindDiagonalOrder.solution(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        System.out.println(Arrays.toString(array));
    }

    private static void dominantIndex() {
        System.out.println(DominantIndex.solution(new int[] {3, 6, 1, 0}));
    }

    private static void pivotIndex() {
        System.out.println(PivotIndex.solutionByViolent(new int[] {1, 7, 3, 6, 5, 6}));
        System.out.println(PivotIndex.solutionBySum(new int[] {1, 7, 3, 6, 5, 6}));
    }

    private static void binarySearch() {
        System.out.println(BinarySearch.solution(new int[] {-1, 0, 3, 5, 9, 12}, 9));
    }

    private static void majorityElement() {
        int[] array = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 7, 7, 7, 7};
        System.out.println(MajorityElement.byMooreVote(array));
    }

    private static void kidsWithCandies() {
        System.out.println(KidsWithCandies.solution(new int[] {2, 3, 5, 1, 3}, 3));
    }

    private static void moveZeroes() {
        MoveZeroes.solution(new int[] {1, 0, 2, 3, 0, 12});
    }

    private static void removeElement() {
        RemoveElement.solution(new int[] {3, 2, 2, 3}, 3);
    }
    // endregion

    // region Linked
    private static void addTwoNumbers() {
        System.out.println(AddTwoNumbers.solution());
    }

    private static void mergeTwoLists() {
        System.out.println(MergeTwoLists.solution());
    }

    private static void hasCycle() {
        System.out.println(HasCycle.solution());
    }
    // endregion

    // region String
    private static void addBinary() {
        System.out.println(AddBinary.solution("1010", "1011"));
    }

    private static void lengthOfLongestSubstring() {
        System.out.println(LengthOfLongestSubstring.slidingWindow("abcabcbb"));
    }

    private static void uncommonFromSentences() {
        System.out.println(Arrays.toString(UncommonFromSentences.solution("this apple is sweet",
            "this apple is sour"
        )));
    }

    private static void longestCommonPrefix() {
        String prefix = LongestCommonPrefix.solution(new String[] {"cir", "car"});
        System.out.println(prefix);
    }
    // endregion

    // region Math

    private static void reverseInteger() {
        System.out.println(ReverseInteger.solution(-1234));
    }

    private static void romanToInteger() {
        System.out.println(RomanToInteger.solution("MCMXCIV"));
    }

    private static void multiply() {
        System.out.println(Multiply.solution("123", "456"));
    }
    // endregion

    // region Sort
    private static int[] target = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};

    private static void selection() {
        SortUtil.selectStraight(target);
        System.out.println(Arrays.toString(target));
    }

    private static void insert() {
        SortUtil.insertStraight(target);
        System.out.println(Arrays.toString(target));
    }

    private static void bubble() {
        SortUtil.bubble(target);
        System.out.println(Arrays.toString(target));
    }

    private static void quick() {
        SortUtil.quick(target);
        System.out.println(Arrays.toString(target));
    }
    // endregion

    // region 动态规划 DP
    private static void uniquePaths() {
        System.out.println(UniquePaths.solution(7, 3));
    }

    private static void minPathSum() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(MinPathSum.solution(grid));
    }

    private static void minDistance() {
        System.out.println(MinDistance.solution("horse", "ros"));
    }

    private static void knapsack01() {
        int[] weights = {2, 2, 6, 5, 4};
        int[] values = {6, 3, 5, 4, 6};
        int v = 10;
        System.out.println(Knapsack01.solution(weights, values, v));
    }
    // endregion
}
