/***
Best Time to Buy and Sell Stocks

Problem Description
Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
Return the maximum possible profit.

Problem Constraints
0 <= A.size() <= 700000
1 <= A[i] <= 107

Input Format
The first and the only argument is an array of integers, A.

Output Format
Return an integer, representing the maximum possible profit.
***/

public class BuySellStocksProblem {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {

        int n = A.length;
        if(n < 2) return 0;
        int min = A[0]; int profit = 0;
        for(int i = 0; i < A.length; i++){
            profit = Math.max(profit,  A[i] - min);
            if(A[i] < min) min = A[i];
        }
        return profit;

    }
}
