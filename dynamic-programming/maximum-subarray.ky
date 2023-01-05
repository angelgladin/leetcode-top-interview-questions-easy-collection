// Maximum Subarray

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var largestSum = 0
        var currentSum = 0
        var largestElement = nums[0]
        for (x in nums) {
            currentSum = maxOf(0, currentSum + x)
            largestSum = maxOf(largestSum, currentSum)
            largestElement = maxOf(largestElement, x)
        }
        return if (largestSum == 0) largestElement else largestSum
    }
}
