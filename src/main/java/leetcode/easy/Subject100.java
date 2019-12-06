package leetcode.easy;

import java.util.Deque;
import java.util.LinkedList;

public class Subject100 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        Deque<TreeNode> stackP = new LinkedList<>();
        Deque<TreeNode> stackQ = new LinkedList<>();

        while (true) {

            if ((p == null && q != null) || (p != null && q == null) || (p != null && p.val != q.val))
                return false;

            if (q != null) {
                stackP.push(p);
                stackQ.push(q);
                p = p.left;
                q = q.left;
            } else {
                if (stackQ.isEmpty())
                    break;
                p = stackP.pop().right;
                q = stackQ.pop().right;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.left.left = new TreeNode(4);
        node.left.left.right = new TreeNode(5);
        node.left.right = new TreeNode(6);
        node.right = new TreeNode(7);
        node.right.left = new TreeNode(8);
        node.right.left.right = new TreeNode(9);
        node.right.right = new TreeNode(10);
        node.right.right.left = new TreeNode(11);

        deepFirstSearch(node);
    }

    // 深度优先搜索
    public static void deepFirstSearch(TreeNode node) {

        Deque<TreeNode> stack = new LinkedList<>();

        while (true) {

            if (node != null) {
                System.out.println(node.val);
                stack.push(node);
                node = node.left;
            } else if (stack.isEmpty()) {
                break;
            } else {
                node = stack.pop().right;
            }

        }

    }

}
