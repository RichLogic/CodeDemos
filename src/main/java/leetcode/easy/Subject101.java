package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class Subject101 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> queueL = new LinkedList<>();
        Queue<TreeNode> queueR = new LinkedList<>();

        if (root != null) {
            queueL.add(root);
            queueR.add(root);
        }

        while (!queueL.isEmpty()) {

            TreeNode tempL = queueL.poll();
            TreeNode tempR = queueR.poll();

            if (tempL.val != tempR.val)
                return false;

            if ((tempL.left == null && tempR.right != null) || (tempL.left != null && tempR.right == null))
                return false;

            if ((tempL.right == null && tempR.left != null) || (tempL.right != null && tempR.left == null))
                return false;

            if (tempL.left != null)
                queueL.add(tempL.left);
            if (tempL.right != null)
                queueL.add(tempL.right);

            if (tempR.right != null)
                queueR.add(tempR.right);
            if (tempR.left != null)
                queueR.add(tempR.left);

        }

        return true;

    }

    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);

        node.left = new TreeNode(2);
        node.right = new TreeNode(7);

        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(6);
        node.right.left = new TreeNode(8);
        node.right.right = new TreeNode(10);

        node.left.left.left = new TreeNode(4);
        node.left.left.right = new TreeNode(5);

        node.right.left.right = new TreeNode(9);
        node.right.right.left = new TreeNode(11);

        breadthFirstSearch(node);
    }

    // 深度优先搜索
    public static void breadthFirstSearch(TreeNode node) {

        Queue<TreeNode> queue = new LinkedList<>();

        if (node != null)
            queue.add(node);

        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();
            System.out.println(temp.val);

            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);

        }

    }

}
