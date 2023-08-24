package maximum_depth_of_binary_tree;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int x) { val = x; }
}

class Solution {
    public int maxDepth(TreeNode1 root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(3);
        root.left = new TreeNode1(9);
        root.right = new TreeNode1(20);
        root.right.left = new TreeNode1(15);
        root.right.right = new TreeNode1(7);

        Solution sol = new Solution();
        int depth = sol.maxDepth(root);
        System.out.println("The maximum depth of the tree is: " + depth);
    }
}
