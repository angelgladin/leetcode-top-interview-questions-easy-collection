// Single Number

class Solution {
    fun singleNumber(nums: IntArray): Int = nums.fold(0) { acc, e -> acc xor e }
}
