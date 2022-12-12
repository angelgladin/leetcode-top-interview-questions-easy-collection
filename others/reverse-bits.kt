// Reverse Bits

class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n: Int): Int {
        var result = 0
        var number = n
        for (i in 0 until 32) {
            val leastSignificantBit = number and 1
            result = result shl 1
            result = result xor leastSignificantBit
            number = number shr 1
        }
        return result
    }
}
