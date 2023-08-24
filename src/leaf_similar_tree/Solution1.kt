package leaf_similar_tree



  var ti = TreeNode(5)
  var v = ti.`val`

 class TreeNode(var `val`: Int) {
     var left: TreeNode? = null
     var right: TreeNode? = null
  }

class Solution {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leftList = mutableListOf<Int>()
        val rightList = mutableListOf<Int>()
        helper(root1, leftList)
        helper1(root2, rightList)
        if (leftList.size != rightList.size) return false
        return leftList == rightList
    }

    fun helper(root: TreeNode?, list: MutableList<Int>) {
        if (root == null) {
            return
        }
        if (root.left == null && root.right == null) {
            list.add(root.`val`)
            return
        }
        helper(root.left, list)
        helper(root.right, list)
    }

    fun helper1(root: TreeNode?, list: MutableList<Int>) {
        if (root == null) {
            return
        }
        if (root.left == null && root.right == null) {
            list.add(root.`val`)
            return
        }
        helper1(root.left, list)
        helper1(root.right, list)
    }
}
