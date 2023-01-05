// Implement strStr()

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val n = haystack.length
        val m = needle.length
        for (i in 0 until n - m + 1) {
            for (j in 0 until m) {
                if (haystack.get(i + j) != needle.get(j)) break
                if (j == m - 1) return i
            }
        }
        
        return -1
    }
}
