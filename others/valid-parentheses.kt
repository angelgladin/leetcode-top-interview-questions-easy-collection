// Valid Parentheses

class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val dictionary = mapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )
        for (x in s) {
            if (x in dictionary.keys)
                stack.push(x)
            else if (stack.isNotEmpty() && x == dictionary[stack.peek()])
                stack.pop()
            else
                return false
        }
        return stack.isEmpty()
    }
}
