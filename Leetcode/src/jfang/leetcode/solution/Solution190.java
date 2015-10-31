package jfang.leetcode.solution;

public class Solution190 {

	// you need treat n as an unsigned value
    public int reverseBits(int n) {
        int mask = 1;
        int result = 0;
        
        for (int i = 0 ;i < 32; i++) {
            if ((mask & n) != 0)
                result = result | 1;
            if (i != 31)
                result = result << 1;
            mask = mask << 1;
        }
        
        return result;
    }
}
