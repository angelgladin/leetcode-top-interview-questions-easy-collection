// Intersection of Two Arrays II

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()

        var i = 0
        var j = 0
        val intersection = mutableListOf<Int>()
        while (i < nums1.size && j < nums2.size) {
            if (nums1[i] < nums2[j]) {
                i++
            } else if (nums1[i] > nums2[j]) {
                j++
            } else {
                intersection.add(nums1[i])
                i++
                j++
            }
        }
        return intersection.toIntArray()
    }
}
