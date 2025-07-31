package Binary_Tree_Examples;

public class SameTree {

    /* Given the roots of two binary trees p and q, write a function to check if they are the same or not.
     * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
     * 
     * Input: p = [1,2,3], q = [1,2,3]
     * Output: true
     * 
     * Input: p = [1,2], q = [1,null,2]
     * Output: false
     * 
     * Input: p = [1,2,1], q = [1,1,2]
     * Output: false
     */
    
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Found the tail, they are the same
        if (p==null && q==null) {
            return true;
        }

        /* Recursive. If values are the same, check their kids.
         * When the recursion returns, both kids must return true
         */
        if (p!=null && q!=null && p.val==q.val) {
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)
                ),
                new TreeNode(3,
                        new TreeNode(6),
                        new TreeNode(7)
                )
        );

        TreeNode root2 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)
                ),
                new TreeNode(3,
                        new TreeNode(6),
                        null
                )
        );

        System.out.println("Tree 1:");
        root1.printTree();

        System.out.println("Tree 2:");
        root2.printTree();

        System.out.println("\nAre they the same tree?: " + Boolean.toString(isSameTree(root1, root2)));
    }
}
