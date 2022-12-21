// Roman to Integer

class Solution {
    fun romanToInt(s: String): Int {
        val map =
            mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        val n = s.length

        var result: Int = map[s.get(n - 1)]!!
        for (i in n - 2 downTo 0) {
            if (map[s.get(i)]!! < map[s.get(i + 1)]!!) {
                result -= map[s.get(i)]!!
            } else {
                result += map[s.get(i)]!!
            }
        }
        return result
    }
}
