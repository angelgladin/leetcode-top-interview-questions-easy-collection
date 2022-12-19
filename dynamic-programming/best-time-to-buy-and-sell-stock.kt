// Best Time to Buy and Sell Stock

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0
        for (i in 1 until prices.size) {
            val profit = prices[i] - minPrice
            maxProfit = maxOf(maxProfit, profit)
            minPrice = minOf(minPrice, prices[i])
        }
        return maxProfit
    }
}
