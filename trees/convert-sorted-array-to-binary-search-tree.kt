// Convert Sorted Array to Binary Search Tree

class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        fun makeTree(start: Int, end: Int): TreeNode? =
            if (start >= end) {
                null
            } else {
                val mid = start + (end - start) / 2
                TreeNode(nums[mid]).apply {
                    left = makeTree(start, mid)
                    right = makeTree(mid + 1, end)
                }
            }

        return makeTree(0, nums.size)
    }
}
