// Best Time to Buy and Sell Stock II

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for (i in 1 until prices.size) {
            if (prices[i - 1] < prices[i]) {
                maxProfit += prices[i] - prices[i - 1]
            }
        }
        return maxProfit
    }
}
