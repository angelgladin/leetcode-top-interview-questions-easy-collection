// Two Sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashTable = mutableMapOf<Int, Int>()
        for (i in 0 until nums.size) {
            val x = nums[i]
            hashTable[x] = i
        }
        
        var result = intArrayOf(-1, -1)
        for (i in 0 until nums.size) {
            val sum = target - nums[i]
            var j = hashTable.get(sum)
            if (j != null && i != j) {
                result = intArrayOf(i, j)
                break
            }
        }
        return result
    }
}
