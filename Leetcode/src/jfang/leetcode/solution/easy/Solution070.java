package jfang.leetcode.solution.easy;

public class Solution070 {

	public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        
        int llast = 1;
        int last = 2;
        
        for (int i = 3; i <= n; i++) {
            int tmp = last + llast;
            llast = last;
            last = tmp;
        }
        
        return last;
    }
}
