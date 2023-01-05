// Climbing Stairs

class Solution {
    fun climbStairs(n: Int): Int {
        val ways = IntArray(46) // `n` problem constraint
        ways[1] = 1
        ways[2] = 2
        for (i in 3..n) {
            ways[i] = ways[i - 1] + ways[i - 2]
        }
        return ways[n]
    }
}
