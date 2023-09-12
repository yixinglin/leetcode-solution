package org.example.array;

// LeetCode #121

public class BestTimetoBuyandSellStock  {

    public static int solution1(int[] prices) {
        int left=0, right=1;
        int maxProfit = 0;
        while(right < prices.length) {
            if (prices[left] < prices[right]) {
                int curProfit = prices[right] - prices[left];
                maxProfit = Math.max(curProfit, maxProfit);
            } else {
                left = right;
            }
            right += 1;
        }
        return maxProfit;
    }

    public static int myFristIdea(int[] prices) {
        int maxProfit = 0;
        int profit;
        int left=0, right=1;
        while(right < prices.length) {
            profit = prices[right] - prices[left];
            maxProfit = Math.max(maxProfit, profit);
            if (profit < 0) {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = myFristIdea(prices);
        System.out.println(maxProfit);
        maxProfit = solution1(prices);
        System.out.println(maxProfit);
    }

}
