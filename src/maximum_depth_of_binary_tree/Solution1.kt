package maximum_depth_of_binary_tree

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution1 {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val left = maxDepth(root.left)
        val right = maxDepth(root.right)
        return Math.max(left, right) + 1
    }

    fun main() {
        val root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)

        val sol = Solution1()
        val depth = sol.maxDepth(root)
        println("The maximum depth of the tree is: $depth")
    }
}
