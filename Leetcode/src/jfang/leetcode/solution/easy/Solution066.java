package jfang.leetcode.solution.easy;


/**
 * Plus One
 * @author jfang
 *
 */
public class Solution066 {

    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }
        if (i >= 0) {
            digits[i]++;
            return digits;
        }
        int[] res = new int[digits.length+1];
        for (int j = 0; j < digits.length; j++)
            res[j+1] = digits[j];
        res[0] = 1;
        return res;
    }
}
