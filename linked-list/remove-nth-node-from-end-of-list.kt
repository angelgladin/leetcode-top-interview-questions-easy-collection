// Remove Nth Node From End of List

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val ghostNode = ListNode(-1)
        var slow: ListNode? = ghostNode
        var fast: ListNode? = ghostNode
        ghostNode.next = head

        repeat(n + 1) { fast = fast?.next }
        while (fast != null) {
            fast = fast?.next
            slow = slow?.next
        }
        slow?.next = slow?.next?.next

        return ghostNode.next
    }
}
