package leaf_similar_tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode124 {
     int val;
      TreeNode124 left;
      TreeNode124 right;
     TreeNode124() {}
     TreeNode124(int val) { this.val = val; }
     TreeNode124(int val, TreeNode124 left, TreeNode124 right) {
          this.val = val;
         this.left = left;
         this.right = right;
      }
  }

class Solution124 {
    public static void main(String[] args) {
        // You can add your test cases here
    }

    public boolean leafSimilar(TreeNode124 root1, TreeNode124 root2) {
        List<Integer> tree1Sequence = new ArrayList<>();
        List<Integer> tree2Sequence = new ArrayList<>();
        addNodeIfIsLeaf(tree1Sequence, root1);
        addNodeIfIsLeaf(tree2Sequence, root2);
        return twoListsAreTheSame(tree1Sequence, tree2Sequence);
    }

    private void addNodeIfIsLeaf(List<Integer> sequence, TreeNode124 node){
        if (node == null){
            return;
        }
        if (node.left == null && node.right == null){
            sequence.add(node.val);
        }
        if (node.left != null){
            addNodeIfIsLeaf(sequence, node.left);
        }
        addNodeIfIsLeaf(sequence, node.right);
    }

    private boolean twoListsAreTheSame(List<Integer> list1, List<Integer> list2){
        int list1Size = list1.size();
        int list2Size = list2.size();
        if (list1Size != list2Size){
            return false;
        }
        for (int i = 0; i < list1Size; i++){
            if (list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }
}
