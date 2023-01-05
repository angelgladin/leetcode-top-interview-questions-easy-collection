// Merge Sorted Array

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var i = m - 1
        var j = n - 1
        var k = m + n - 1

        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j]
                j--
            } else {
                nums1[k] = nums1[i]
                i--
            }
            k--
        }
        
        while (j >= 0) {
            nums1[k] = nums2[j]
            j--
            k--
        }
    }
}
