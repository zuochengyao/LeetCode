package com.icheero.theory.tree;

class BinaryTreeNode
{
    public int val;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    BinaryTreeNode() {}

    BinaryTreeNode(int val) { this.val = val; }

    BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
