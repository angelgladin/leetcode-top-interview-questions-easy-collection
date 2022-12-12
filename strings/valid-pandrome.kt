// Valid Palindrome

class Solution {
    fun isPalindrome(s: String): Boolean {
        val formattedString = s.filter { it.isLetter() || it.isDigit() }.toLowerCase()

        var i = 0
        var j = formattedString.length - 1
        while (i < j) {
            if (formattedString.get(i) != formattedString.get(j)) return false
            i++
            j--
        }
        return true
    }
}
