// Merge Two Sorted Lists

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        var l1 = list1
        var l2 = list2
        val dummyNode = ListNode(-1)
        var current = dummyNode
        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                current.next = l1
                l1 = l1.next
            } else {
                current.next = l2
                l2 = l2.next
            }
            current = current.next
        }
        
        if (l1 == null)
            current.next = l2
        if (l2 == null)
            current.next = l1
        
        return dummyNode.next
    }
}
