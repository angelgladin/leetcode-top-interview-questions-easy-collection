// Validate Binary Search Tree

/**
 * Example: var ti = TreeNode(5) var v = ti.`val` Definition for a binary tree node. class
 * TreeNode(var `val`: Int) { var left: TreeNode? = null var right: TreeNode? = null }
 */
class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        fun nodeInRange(node: TreeNode?, min: Long, max: Long): Boolean {
            if (node == null) return true
            if (node != null && (node.`val` >= max || node.`val` <= min)) return false
            return nodeInRange(node.left, min, node.`val`.toLong()) &&
                nodeInRange(node.right, node.`val`.toLong(), max)
        }
        return nodeInRange(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }
}
