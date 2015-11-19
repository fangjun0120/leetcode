package jfang.leetcode.solution.medium;

import java.util.Arrays;

public class Solution016 {

	public int threeSumClosest(int[] num, int target) {
        int len = num.length;
        int diff = Integer.MAX_VALUE;
        int opt_sum = 0;
        Arrays.sort(num);
        
        for (int i = 0; i < len-2; i++) {
            if (i != 0 && num[i] == num[i-1])
                continue;
            int left = i+1;
            int right = len-1;
            while (left < right) {
                int sum = num[i] + num[left] + num[right];
                int value = Math.abs(sum - target);
                if (value == 0)
                    return target;
                else if (value < diff) {
                    diff = value;
                    opt_sum = sum;
                }
                if (sum > target)
                    right--;
                else
                    left++;
            }
        }
        
        return opt_sum;
    }
}
