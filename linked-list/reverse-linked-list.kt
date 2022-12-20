// Remove Linked List

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var previous: ListNode? = null
        var current = head
        while (current != null) {
            val next = current.next
            current.next = previous
            previous = current
            current = next
        }
        return previous
    }
}
