// Validate Binary Search Tree

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
