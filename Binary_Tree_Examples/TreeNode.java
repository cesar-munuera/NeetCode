package Binary_Tree_Examples;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void printTree() {
        printTree("", this, false);
    }

    private void printTree(String prefix, TreeNode node, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.val);
            printTree(prefix + (isLeft ? "│   " : "    "), node.left, true);
            printTree(prefix + (isLeft ? "│   " : "    "), node.right, false);
        }
    }
}