// Shuffle an Array

class Solution(nums: IntArray) {
    
    private val array: IntArray = nums.clone()
    
    private fun IntArray.swap(i: Int, j: Int) {
        val tmp = this[i]
        this[i] = this[j]
        this[j] = tmp
    }
    
    fun reset(): IntArray = array

    fun shuffle(): IntArray {
        val n = array.size - 1
        val newArray = array.clone()
        for (i in 0..n) {
            val j = (i..n).random()
            newArray.swap(i, j)
        }
        return newArray
    }

}
