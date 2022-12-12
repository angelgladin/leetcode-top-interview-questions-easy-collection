// Pascal's Triangle

class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val pascalTriangle = mutableListOf<List<Int>>()
        pascalTriangle.add(listOf(1))

        for (k in 1 until numRows) {
            val previousRow = pascalTriangle.last()
            val newRow = mutableListOf<Int>()

            newRow.add(1)
            for (i in 1 until previousRow.size) {
                val n = previousRow[i - 1] + previousRow[i]
                newRow.add(n)
            }
            newRow.add(1)

            pascalTriangle.add(newRow)
        }
        return pascalTriangle
    }
}
