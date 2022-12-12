// Linked List Cycle

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false

        var fast = head
        var slow = head
        while (fast != null && fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (slow === fast) return true
        }
        return false
    }
}
