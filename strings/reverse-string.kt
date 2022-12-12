// Reverse String

class Solution {
    fun reverseString(s: CharArray) {
        var j = s.size - 1
        var i = 0
        while (i < j) {
            val tmp = s[i]
            s[i] = s[j]
            s[j] = tmp

            i++
            j--
        }
    }
}
