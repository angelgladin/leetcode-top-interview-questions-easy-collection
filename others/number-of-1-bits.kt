// Number of 1 Bits

class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n: Int): Int {
        var number = n
        var ones = 0
        while (number != 0) {
            ones = ones + (number and 1)
            number = number ushr 1
        }
        return ones
    }
}
