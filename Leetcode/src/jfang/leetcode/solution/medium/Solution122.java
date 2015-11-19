package jfang.leetcode.solution.medium;

public class Solution122 {

	public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1)
            return 0;
            
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            int value = prices[i] - prices[i-1];
            if (value > 0)
                sum += value;
        }
    
        return sum;
    }
}
