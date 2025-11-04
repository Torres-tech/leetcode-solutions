# Best Time to Buy and Sell Stocks

# Problem

The task is to determine the maximum profit achievable from a single buy-and-sell transaction in a given list of stock prices. Each element in the array prices[i] represents the price of a stock on the i-th day.
You are allowed to complete only one transaction — meaning you can buy the stock once and sell it once later.
The goal is to find the largest possible profit, ensuring that the selling day always comes after the buying day.
If no profit can be made (the price only decreases), the output should be 0.

Example:
Input: [7,1,5,3,6,4]
Output: 5
Explanation: The best strategy is to buy at 1 (day 2) and sell at 6 (day 5), giving a profit of 6 - 1 = 5.

# Solution Description

Here’s how it works step by step:

Initialization:

buyPrice is set to the first price, assuming you buy on day 1.

profit is initialized to 0 because no profit has been made yet.

Single Pass Through Prices:

As you iterate through the list, you continuously track the lowest price encountered so far (buyPrice).

For each day, you calculate the potential profit if you were to sell on that day:
currentProfit = prices[i] - buyPrice

If this potential profit is higher than your current recorded profit, you update it.

Result:

At the end of the loop, profit holds the maximum achievable gain from one buy-sell transaction.

This approach ensures that you always buy before you sell, and it dynamically adjusts based on the market’s behavior without checking every possible pair of days.

# Complexity Analysist
### Time Complexity - O(n)    

The algorithm iterates through the array only once. Each operation inside the loop (comparisons and arithmetic) takes constant time.

### Space Complexity - O(1)    

Only two integer variables (buyPrice and profit) are used regardless of input size, so memory usage stays constant.
