// Validate Binary Search Tree

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        fun nodeInRange(node: TreeNode?, min: Long, max: Long): Boolean =
            when {
                node == null -> true
                node != null && (node.`val` >= max || node.`val` <= min) -> false
                else ->
                    nodeInRange(node.left, min, node.`val`.toLong()) &&
                        nodeInRange(node.right, node.`val`.toLong(), max)
            }
        return nodeInRange(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }
}
