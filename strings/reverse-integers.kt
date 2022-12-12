// Reverse Integers

class Solution {
    fun reverse(x: Int): Int {
        var result = 0L
        val sign = if (x > 0) 1 else -1
        var num = Math.abs(x)

        while (num > 0) {
            result = (result * 10) + (num % 10)
            num = num / 10
        }
        return if (result > Integer.MAX_VALUE) 0 else result.toInt() * sign
    }
}
