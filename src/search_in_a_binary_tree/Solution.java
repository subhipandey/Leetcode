package search_in_a_binary_tree;

class TreeNode3 {
    int val;
    TreeNode3 left;
      TreeNode3 right;
    TreeNode3() {}
     TreeNode3(int val) { this.val = val; }
     TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}

class Solution124 {
    TreeNode3 curr = null;
    public TreeNode3 searchBST(TreeNode3 root, int val) {
        helper(root,val);
        return curr;
    }
    private void helper(TreeNode3 root, int val){
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

