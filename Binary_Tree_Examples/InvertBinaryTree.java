package Binary_Tree_Examples;

public class InvertBinaryTree {

    /*
     * Given the root of a binary tree, invert the tree, and return its root.
     * 
     * Input: root = [4,2,7,1,3,6,9]
     * Output: [4,7,2,9,6,3,1]
     * 
     * Input: root = [2,1,3]
     * Output: [2,3,1]
     */

    public static TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode aux = root.right;
        root.right = root.left;
        root.left = aux;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(),
                new TreeNode(2));

        System.out.println("Original tree:");
        root.printTree();

        invertTree(root);

        System.out.println("\nInverted tree:");
        root.printTree();
    }
}
