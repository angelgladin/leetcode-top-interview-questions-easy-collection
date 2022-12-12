// First Unique Character in a String

class Solution {
    fun firstUniqChar(s: String): Int {
        val frequencies = s.groupingBy { it }.eachCount()
        for (i in 0 until s.length) {
            if (frequencies[s.get(i)] == 1) {
                return i
            }
        }
        return -1
    }
}
