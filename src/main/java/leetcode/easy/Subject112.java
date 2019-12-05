package leetcode.easy;

import java.util.*;

public class Subject112 {

    public static void main(String[] args) {

        // [5,4,8,11,null,13,4,7,2,null,null,null,1]

        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(1);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t6.right = t9;

        System.out.println(hasPathSum(t1, 22));
    }

//              5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \      \
//        7    2      1

    public static boolean hasPathSum(TreeNode root, int target) {

        // 循环版本
        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
        Set<TreeNode> beenSet = new HashSet<>();
        TreeNode node = root;
        int sum = 0;

        while (true) {

            node.val += sum;
            nodeQueue.push(node);
            beenSet.add(node);

            if (node.left == null && node.right == null)
                if (node.val == target)
                    return true;
                else
                    nodeQueue.pop();





            if (node.left != null && !beenSet.contains(node.left))
                node = node.left;

            if (node.right != null && !beenSet.contains(node.right))
                node = node.right;

            if (nodeQueue.isEmpty())
                break;
        }

        return false;

        // 递归版本
//        return addSum(root, 0, sum, false);
    }

    private static boolean addSum(TreeNode node, int sum, int target, boolean flag) {
        node.val += sum;

        if (node.left == null && node.right == null && node.val == target)
            return true;

        if (node.left != null)
            flag = addSum(node.left, node.val, target, flag);
        if (node.right != null)
            flag = addSum(node.right, node.val, target, flag);

        return flag;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
