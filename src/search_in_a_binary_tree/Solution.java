package search_in_a_binary_tree;

class TreeNode {
    int val;
    TreeNode left;
      TreeNode right;
    TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}

class Solution {
    TreeNode curr = null;
    public TreeNode searchBST(TreeNode root, int val) {
        helper(root,val);
        return curr;
    }
    private void helper(TreeNode root, int val){
        if(root==null) return;
        if(val>root.val){
            helper(root.right,val);
        }
        if(val<root.val){
            helper(root.left,val);
        }
        if(val==root.val){
            curr=root;
        }
    }

    public static void main(String[] args) {
    }
}

