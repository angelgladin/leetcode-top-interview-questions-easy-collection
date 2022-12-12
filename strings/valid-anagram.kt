// Valid Anagram

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sFrequencies = s.groupingBy { it }.eachCount()
        val tFrequencies = t.groupingBy { it }.eachCount()
        return sFrequencies == tFrequencies
    }
}
