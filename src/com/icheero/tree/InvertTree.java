package com.icheero.tree;

public class InvertTree
{
    public static TreeNode solution(TreeNode root)
    {
        if (root == null)
            return null;

        invert(root.left, root.right);
        return root;
    }

    private static void invert(TreeNode left, TreeNode right)
    {
        TreeNode temp = left;
        left = right;
        right = temp;
        invert(left.left, left.right);
        invert(right.left, right.right);
    }
}
