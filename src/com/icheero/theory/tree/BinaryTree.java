package com.icheero.theory.tree;

import java.util.Stack;

/**
 * @author Work
 * @date 2023-02-27
 */
class BinaryTree {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
        root.right.left.left = new BinaryTreeNode(8);
        root.right.left.right = new BinaryTreeNode(9);
        BinaryTree tree = new BinaryTree(root);
        tree.lastOrderIterate();
    }

    /**
     * 根节点
     */
    private BinaryTreeNode root;

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    /**
     * 清空二叉树
     */
    public void clear() {
        delete(this.root);
    }

    /**
     * 删除节点
     *
     * @param node 待删除的节点
     */
    public void delete(BinaryTreeNode node) {
        if (node == null)
            return;
        delete(node.left);
        delete(node.right);
        node = null;
    }

    /**
     * 判断二叉树是否为空
     */
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * 二叉树的高度
     */
    public int height() {
        return height(this.root);
    }

    /**
     * 二叉树中某个节点的高度
     */
    public int height(BinaryTreeNode node) {
        if (isEmpty()) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    /**
     * 获取二叉树节点数
     */
    public int size() {
        return size(this.root);
    }

    /**
     * 获取以某个节点为根的子树的节点数实现。
     */
    public int size(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }
        return size(node.left) + size(node.right) + 1;
    }

    /**
     * 返回某节点的父亲节点
     */
    public BinaryTreeNode getParent(BinaryTreeNode node) {
        if (this.root == null || node == null) {
            return null;
        }
        return getParent(this.root, node);
    }

    public BinaryTreeNode getParent(BinaryTreeNode subTree, BinaryTreeNode node) {
        if (subTree == null || node == null) {
            return null;
        }
        if (subTree.left == node || subTree.right == node) {
            return subTree;
        }
        BinaryTreeNode parent;
        if ((parent = getParent(subTree.left, node)) != null) {
            return parent;
        } else {
            return getParent(subTree.right, node);
        }
    }

    /**
     * 返回右子树
     */
    public BinaryTreeNode getLeft(BinaryTreeNode node) {
        return node == null ? null : node.left;
    }

    /**
     * 返回右子树
     */
    public BinaryTreeNode getRight(BinaryTreeNode node) {
        return node == null ? null : node.right;
    }

    /**
     * 插入左子树
     */
    public void insertLeft(BinaryTreeNode node) {
        insertLeft(this.root, node);
    }

    public void insertLeft(BinaryTreeNode parent, BinaryTreeNode node) {
        if (parent == null) {
            return;
        }
        parent.left = node;
    }

    /**
     * 插入右子树
     */
    public void insertRight(BinaryTreeNode node) {
        insertRight(this.root, node);
    }

    public void insertRight(BinaryTreeNode parent, BinaryTreeNode node) {
        if (parent == null) {
            return;
        }
        parent.right = node;
    }

    /**
     * 先序遍历 递归
     */
    public void firstOrder() {
        firstOrder(this.root);
    }

    public void firstOrder(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        operate(node);
        firstOrder(node.left);
        firstOrder(node.right);
    }

    /**
     * 先序遍历 迭代
     */
    public void firstOrderIterate() {
        firstOrderIterate(this.root);
    }

    public void firstOrderIterate(BinaryTreeNode node) {
        if (node == null)
            return;
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(node);//首先把根节点放入栈中
        while (!stack.isEmpty()) {
            //当栈中不为空的时候，执行以下操作
            BinaryTreeNode temp = stack.pop();//取出栈中的节点，用一个临时变量保存
            operate(temp);//将变量的值加入结果队列中
            if (temp.right != null)
                stack.push(temp.right);//如果该节点的右⼦树不为空，则把有节点放⼊栈
            if (temp.left != null)
                stack.push(temp.left);//如果该节点的左⼦树不为空，则把左⼦树放⼊栈中。
        }
    }

    /**
     * 中序遍历 递归
     */
    public void mediumOrder() {
        mediumOrder(this.root);
    }

    public void mediumOrder(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        mediumOrder(node.left);
        operate(node);
        mediumOrder(node.right);
    }

    /**
     * 中序遍历 迭代
     */
    public void mediumOrderIterate() {
        mediumOrderIterate(this.root);
    }

    public void mediumOrderIterate(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode cur = node;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                operate(cur);
                cur = cur.right;
            }
        }
    }

    /**
     * 后序遍历
     */
    public void lastOrder() {
        lastOrder(this.root);
    }

    public void lastOrder(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        lastOrder(node.left);
        lastOrder(node.right);
        operate(node);
    }

    /**
     * 后序遍历 迭代
     */
    public void lastOrderIterate() {
        lastOrderIterate(this.root);
    }

    public void lastOrderIterate(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        Stack<BinaryTreeNode> stackOut = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            BinaryTreeNode cur = stack.pop();
            stackOut.push(cur);
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        while (!stackOut.isEmpty()) {
            operate(stackOut.pop());
        }
    }

    private void operate(BinaryTreeNode node) {
        if (node == null)
            return;
        System.out.println(node.val);
    }
}
