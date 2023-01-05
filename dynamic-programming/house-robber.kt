// House Robber

class Solution {
    fun rob(nums: IntArray): Int {
        val n = nums.size
        val maxMoney = IntArray(n + 1)
        maxMoney[1] = nums[0]
        for (i in 1 until n) {
            maxMoney[i + 1] = maxOf(maxMoney[i], maxMoney[i - 1] + nums[i])
        }
        return maxMoney[n]
    }
}
