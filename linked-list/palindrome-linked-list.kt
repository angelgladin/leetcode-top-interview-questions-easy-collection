// Palindrome Linked List

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        val valuesList = mutableListOf<Int>()
        var current = head
        while (current != null) {
            val value = current.`val`
            valuesList.add(value)
            current = current.next
        }
        
        var i = 0
        var j = valuesList.size - 1
        while (i < j) {
            if (valuesList[i] != valuesList[j]) {
                return false
            }
            i++
            j--
        }
        return true
    }
}
