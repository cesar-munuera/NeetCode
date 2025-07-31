package Binary_Tree_Examples;

public class MaximumDepthBinaryTree {

    /*
     * Given the root of a binary tree, return its maximum depth.
     * A binary tree's maximum depth is the number of nodes along the longest path
     * from the root node down to the farthest leaf node.
     * 
     * Input: root = [3,9,20,null,null,15,7]
     * Output: 3
     * 
     * Input: root = [1,null,2]
     * Output: 2
     */

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int total = 1 + (Math.max(maxDepth(root.left), maxDepth(root.right)));
        return total;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3,
                        new TreeNode(6),
                        new TreeNode(7,
                                null,
                                new TreeNode(9,
                                        new TreeNode(5),
                                        null))));

        System.out.println("Tree:");
        root.printTree();

        System.out.println("Depth: " + maxDepth(root));
    }

}