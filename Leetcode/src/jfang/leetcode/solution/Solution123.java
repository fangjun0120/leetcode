package jfang.leetcode.solution;

public class Solution123 {

	public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
            return 0;
            
        int len = prices.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 0;
        right[len-1] = 0;
        
        // start from left
        int minIndex = 0;
        int max = 0;
        for (int i = 1; i < len; i++) {
            int value = prices[i] - prices[minIndex];
            if (value > max)
                max = value;
            if (prices[i] < prices[minIndex])
                minIndex = i;
            left[i] = max;
        }
        
        // start from right
        int maxIndex = len-1;
        max = 0;
        for (int i = len-2; i >= 0; i--) {
            int value = prices[maxIndex] - prices[i];
            if (value > max)
                max = value;
            if (prices[i] > prices[maxIndex])
                maxIndex = i;
            right[i] = max;
        }
        
        // find max sum
        max = 0;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, left[i] + right[i]);
        }
        
        return max;
    }
}
