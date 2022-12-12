// Rotate Array

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        fun reverseSubsegment(nums: IntArray, start: Int, end: Int) {
            var start = start
            var end = end
            while (start < end) {
                val tmp = nums[start]
                nums[start] = nums[end]
                nums[end] = tmp

                start++
                end--
            }
        }

        val n = nums.size
        val k = k % n

        reverseSubsegment(nums, 0, n - 1)
        reverseSubsegment(nums, 0, k - 1)
        reverseSubsegment(nums, k, n - 1)
    }
}
