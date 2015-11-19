package jfang.leetcode.solution.medium;

public class Solution121 {

	public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1)
            return 0;
        
        int minIndex = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int value = prices[i] - prices[minIndex];
            if (value > max)
                max = value;
            if (prices[i] < prices[minIndex])
                minIndex = i;
        }
    
        return max;
    }
}
