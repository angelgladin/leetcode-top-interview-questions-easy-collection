// Symmetric Tree

class Solution {
    fun isSymmetric(root: TreeNode): Boolean {
        fun isSymmetric(left: TreeNode?, right: TreeNode?): Boolean =
            when {
                left == null && right == null -> true
                left == null || right == null -> false
                else ->
                    left.`val` == right.`val` &&
                        isSymmetric(left.left, right.right) &&
                        isSymmetric(left.right, right.left)
            }
        return isSymmetric(root.left, root.right)
    }
}
