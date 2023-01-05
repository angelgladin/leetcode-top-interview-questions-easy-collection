// Longest Common Prefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var prefixSoFar = ""
        var longestCommonPrefix = strs.first()
        for (k in 1 until strs.size) {
            var prefixSize = 0
            for (i in 0 until strs[k].length) {
                val longestCommonPrefixChar = longestCommonPrefix.getOrNull(i)
                val strsChar = strs[k].getOrNull(i)
                if (longestCommonPrefixChar != strsChar) {
                    break
                }
                prefixSize = i + 1
            }

            prefixSoFar = strs[k].substring(0, prefixSize)
            longestCommonPrefix = prefixSoFar
        }
        
        return longestCommonPrefix
    }
}
