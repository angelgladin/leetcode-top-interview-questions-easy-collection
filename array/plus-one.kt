// Plus One

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var rightPointer = digits.size - 1
        var carry = 1
        var result = mutableListOf<Int>()

        while (rightPointer >= 0) {
            val digit = digits[rightPointer] + carry
            result.add(digit % 10)
            if (digit == 10) {
                carry = 1
            } else {
                carry = 0
            }
            rightPointer--
        }
        result = result.asReversed()
        if (carry == 1) {
            result.add(0, 1)
        }
        return result.toIntArray()
    }
}
