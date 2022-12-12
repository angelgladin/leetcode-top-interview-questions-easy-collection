// Hamming Distance

class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        var a = x
        var b = y
        
        var distance = 0
        while (a != 0 || b != 0) {
            val hasDistance = (a and 1) xor (b and 1) == 1
            distance += if (hasDistance) 1 else 0

            a = a ushr 1
            b = b ushr 1
        }
        return distance
    }
}
