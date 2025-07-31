package Binary_Tree_Examples;

public class SubtreeofAnotherTree {

    /* Given the roots of two binary trees root and subRoot,
     * return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
     * A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants.
     * The tree tree could also be considered as a subtree of itself.
     * 
     * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
     * Output: true
     * 
     * Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
     * Output: false
     */

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null) {          // End of subroot, means it is a subchild
            return true;
        } else if (root == null) {
            return false;               // Finished searching at root, subRoot not found
        }

        // Check if the sobroot is the same as some node of the root
        if (SameTree.isSameTree(root, subRoot)) {
            return true;
        }

        // If not, much search in root childs to see if the subRoot is a sobroot
        return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
            new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2,
                    new TreeNode(0),
                    null
                )
            ),
            new TreeNode(5)
        );

        TreeNode subRoot = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2)
        );

        System.out.println("Tree:");
        root.printTree();

        System.out.println("Sub tree:");
        subRoot.printTree();

        System.out.println("\nSubtree?: " + Boolean.toString(isSubtree(root, subRoot)));
    }
    
}
