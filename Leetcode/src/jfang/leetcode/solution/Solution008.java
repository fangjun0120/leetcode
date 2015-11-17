package jfang.leetcode.solution;

import java.math.BigDecimal;

/**
 * String to Integer (atoi)
 * @author jfang
 *
 */
public class Solution008 {

    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        // remove whitespace
        str = str.trim();
        
        boolean isNegtive = false;
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            if (str.charAt(0) == '-')
                isNegtive = true;
            str = str.substring(1);
        }
        
        double n = 0;
        for (char c: str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                n = c - '0' + n * 10;
            }
            else {
                break;
            }
        }
        
        if (isNegtive) {
            n = -1 * n;
        }
        
        // handle integer overflow
        if (n > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (n < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return new BigDecimal(n).intValueExact();
    }
}
