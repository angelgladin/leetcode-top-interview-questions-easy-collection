// Maximum Depth of Binary Tree

class Solution {
    fun maxDepth(root: TreeNode?): Int =
        if (root == null) 0 else 1 + maxOf(maxDepth(root.left), maxDepth(root.right))
}
