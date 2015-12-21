package jfang.leetcode.solution.medium;

/**
 * Decode Ways
 * @author jfang
 *
 */
public class Solution091 {

    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0')
            return 0;
        
        int prepre = 1;
        int pre = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i-1) == '1' || s.charAt(i-1) == '2') {
                    pre = prepre;
                    prepre = 0;
                }
                else
                    return 0;
            }
            else {
                if (s.charAt(i-1) == '1' || (s.charAt(i-1) == '2' && s.charAt(i) <= '6')) {
                    int tmp = pre + prepre;
                    prepre = pre;
                    pre = tmp;
                }
                else
                    prepre = pre;
            }
        }
        return pre;
    }
}
