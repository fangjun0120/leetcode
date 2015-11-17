package jfang.leetcode.solution;

import java.math.BigDecimal;

/**
 * Reverse Integer
 * @author jfang
 *
 */
public class Solution007 {

    public int reverse(int x) {
        long rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x = x/10;
        }

        // in case of int overflow
        int res;
        try {
            res = new BigDecimal(rev).intValueExact();
        } catch (ArithmeticException e) {
            res = 0;
        }
        return res;
    }
}
