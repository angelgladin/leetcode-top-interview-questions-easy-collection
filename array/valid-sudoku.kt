// Valid Sudoku

// TODO: agregar comentarios
class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val seen = mutableSetOf<String>()
        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val char = board[i][j]
                if (char != '.') {
                    // String Hashing to encode a number in a pseudo grid.
                    val rowHash = "$char $i ROW"
                    val columnHash = "$char $j COLUMN"
                    val subgridHash = "$char ${i / 3}-${j / 3}"
                    if (rowHash in seen || columnHash in seen || subgridHash in seen) {
                        return false
                    } else {
                        seen.add(rowHash)
                        seen.add(columnHash)
                        seen.add(subgridHash)
                    }
                }
            }
        }
        return true
    }
}
