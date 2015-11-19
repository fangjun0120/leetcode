package jfang.leetcode.solution.easy;

/**
 * Add Digits
 * @author jfang
 *
 */
public class Solution258 {

    public int addDigits(int num) {
        while(num > 9) {
            int value = 0;
            while (num != 0) {
                value += num % 10;
                num = num / 10;
            }
            num = value;
        }
        return num;
    }
}
