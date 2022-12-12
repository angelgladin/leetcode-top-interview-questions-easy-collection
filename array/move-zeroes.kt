// Move Zeroes

class Solution {
    fun moveZeroes(nums: IntArray) {
        var chunkSize = 0
        for (i in 0 until nums.size) {
            if (nums[i] != 0) {
                val tmp = nums[i]
                nums[i] = nums[chunkSize]
                nums[chunkSize] = tmp

                chunkSize++
            }
        }
    }
}
