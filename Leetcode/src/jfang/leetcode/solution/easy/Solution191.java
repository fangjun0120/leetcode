package jfang.leetcode.solution.easy;

public class Solution191 {

	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int loop = 0;
        int i = 1;
    
        while (loop < 32) {
            if ((n & i) != 0)
                count ++;
            i = i << 1;
            loop++;
        }
        
        return count;
    }
}
