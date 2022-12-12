// Contains Duplicate

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        nums.sort()
        
        for (i in 1 until nums.size) {
            if (nums[i - 1] == nums[i]) return true
        }
        return false
    }
}
