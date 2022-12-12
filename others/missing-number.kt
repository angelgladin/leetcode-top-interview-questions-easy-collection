// Missing Number

class Solution {
    fun missingNumber(nums: IntArray): Int {
        var missingNumber = nums.size
        for (i in 0 until nums.size) {
            missingNumber = missingNumber xor nums[i] xor i
        }
        return missingNumber
    }
}
