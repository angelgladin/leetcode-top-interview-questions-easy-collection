// Rotate Array

class Solution {
    fun rotate(nums: IntArray, k: Int) {
        fun reverseSubsegment(start: Int, end: Int) {
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
        reverseSubsegment(0, n - 1)
        reverseSubsegment(0, k - 1)
        reverseSubsegment(k, n - 1)
    }
}
