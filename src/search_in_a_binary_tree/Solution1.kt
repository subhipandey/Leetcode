package search_in_a_binary_tree



var ti = TreeNode(5)
var v = ti.`val`
 class TreeNode(var `val`: Int) {
      var left: TreeNode? = null
      var right: TreeNode? = null
  }

class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return null
        return if (root.`val` == `val`) root else if (root.`val` > `val`)
            searchBST(root.left, `val`) else searchBST(root.right, `val`)
    }
}
