package com.icheero.theory.tree;

public class InvertTree
{
    public static BinaryTreeNode solution(BinaryTreeNode root)
    {
        if (root == null)
            return null;

        invert(root.left, root.right);
        return root;
    }

    private static void invert(BinaryTreeNode left, BinaryTreeNode right)
    {
        BinaryTreeNode temp = left;
        left = right;
        right = temp;
        invert(left.left, left.right);
        invert(right.left, right.right);
    }
}
