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
        for (int buy = 0; buy < prices.length; buy++) {
            for (int sell = buy; sell <prices.length; sell++) {
                int curProfit = prices[sell] - prices[buy];
                if(curProfit > maxProfit) {
                    maxProfit = curProfit;
                }
            }
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
