// Count Primes

class Solution {
    fun countPrimes(n: Int): Int {
        if (n < 2) return 0

        val sieve = BooleanArray(n) { true } // Strictly less `n`
        sieve[0] = false
        sieve[1] = false
        val root = Math.sqrt(n.toDouble()).toInt()
        for (i in 2..root) {
            if (sieve[i]) { // Is prime
                for (j in (i * 2) until n step i) {
                    sieve[j] = false // Not prime. Composite number
                }
            }
        }
        val numberOfPrimes = sieve.count { it }
        return numberOfPrimes
    }
}
