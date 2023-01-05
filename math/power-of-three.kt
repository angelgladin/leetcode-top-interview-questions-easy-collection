// Power of Three

class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        if (n < 1) return false
        var x = n
        while (x % 3 == 0) {
            x /= 3
        }
        return x == 1
    }
}
