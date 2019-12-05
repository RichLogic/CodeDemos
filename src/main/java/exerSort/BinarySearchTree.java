package exerSort;

public class BinarySearchTree {
    private Node root;

    private class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node find(int data) {
        Node node = root;

        while (node != null) {
            if (data < node.data) {
                node = node.left;
            } else if (data > node.data) {
                node = node.right;
            } else {
                return node;
            }
        }

        return null;
    }

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }

        Node node = root;
        while (true) {
            if (data < node.data) {
                if (node.left == null) {
                    node.left = new Node(data);
                    return;
                }
                node = node.left;
            } else if (data > node.data) {
                if (node.right == null) {
                    node.right = new Node(data);
                    return;
                }
                node = node.right;
            } else {
                System.out.println("已经存在");
                return;
            }
        }
    }

    public void delete(int data) {
        Node node = root;
        Node parent = null;

        while (node != null) {
            if (data < node.data) {
                parent = node;
                node = node.left;
            } else if (data > node.data) {
                parent = node;
                node = node.right;
            } else { // 当前节点为要删除的节点

                Node child;

                // 要删除的节点没有子节点，要将父节点的引用设置为 null
                if (node.left == null && node.right == null) {
                    child = null;                    
                // 要删除的节点有两个节点
                } else if (node.left != null && node.right != null) {
                    Node primary = node.right;
                    while (primary != null) {
                        primary = primary.left;
                    }
                    child = primary;
                // 要删除的节点只有一个子节点
                } else {
                    if (node.left != null) child = node.left;
                    else child = node.right;
                }

                if (parent == null) root = child;
                else if (parent.left == node) parent.left = child;
                else if (parent.right == node) parent.right = child;
            }
        }
    }

}
