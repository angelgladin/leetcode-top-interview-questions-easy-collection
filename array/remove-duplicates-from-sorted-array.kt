// Remove Duplicates from Sorted Array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var insertingIndex = 1
        for (i in 1 until nums.size) {
            if (nums[i - 1] != nums[i]) {
                nums[insertingIndex] = nums[i]
                insertingIndex++
            }
        }
        return insertingIndex
    }
}
