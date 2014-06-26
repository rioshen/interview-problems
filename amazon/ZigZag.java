import java.util.*;

/**
 * Problem:
 * ZigZag order tree traversal.
 */
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

public class ZigZag {
    /**
     * Solution:
     * As this problem is a variant of level order traversal. We first
     * implement the level order traversal iteration.
     */
    public static void levelOrder(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Invalid tree.");
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.value + " ");

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    /**
     * Solution:
     * Same like level order traversal, for breath first traversal, queue is more appropriate
     * than stack. So in my solution, I use a single queue and a flag to control enqueue order.
     *
     */
    public static void zigzag(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException();
        }

        int level = 1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.value + " ");
            if (level % 2 != 0) { // Odd level, traverse from left to right.
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            } else { //Even level, traverse from right to left.
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
            }
            level++;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode one = new TreeNode(2);
        TreeNode two = new TreeNode(3);
        TreeNode three = new TreeNode(4);
        TreeNode four = new TreeNode(5);
        TreeNode five = new TreeNode(6);
        TreeNode six = new TreeNode(7);

        root.left = one;
        root.right = two;
        one.left = six;
        one.right = five;
        two.left = four;
        two.right = three;
        levelOrder(root);
        System.out.println();
        zigzag(root);
    }
}
