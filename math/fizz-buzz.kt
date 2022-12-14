// Fizz Buzz

class Solution {
    fun fizzBuzz(n: Int): List<String> =
        (1..n).map {
            when {
                it % 15 == 0 -> "FizzBuzz"
                it % 3 == 0 -> "Fizz"
                it % 5 == 0 -> "Buzz"
                else -> it.toString()
            }
        }
}
