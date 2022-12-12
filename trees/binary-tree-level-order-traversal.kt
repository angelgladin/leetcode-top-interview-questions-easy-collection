// Binary Tree Level Order Traversal

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        fun bfs(node: TreeNode?, level: Int, levelList: MutableList<MutableList<Int>>) {
            if (node == null) return

            if (level == levelList.size) levelList.add(mutableListOf<Int>())

            levelList[level].add(node.`val`)

            bfs(node.left, level + 1, levelList)
            bfs(node.right, level + 1, levelList)
        }

        val result = mutableListOf<MutableList<Int>>()
        bfs(root, 0, result)
        return result
    }
}
