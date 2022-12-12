// Rotate Image

class Solution {

    fun rotate(matrix: Array<IntArray>) {
        // The trick here is to: transpose the matrix and then a vertical (columns) reverse over the
        // matrix.
        fun transpose(matrix: Array<IntArray>, n: Int) {
            for (i in 0 until n) {
                for (j in i + 1 until n) {
                    val tmp = matrix[i][j]
                    matrix[i][j] = matrix[j][i]
                    matrix[j][i] = tmp
                }
            }
        }

        fun reverseColumns(matrix: Array<IntArray>, n: Int) {
            for (i in 0 until n) {
                for (j in 0 until n / 2) {
                    val tmp = matrix[i][j]
                    matrix[i][j] = matrix[i][n - j - 1]
                    matrix[i][n - j - 1] = tmp
                }
            }
        }

        transpose(matrix, matrix.size)
        reverseColumns(matrix, matrix.size)
    }
}
