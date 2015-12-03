package jfang.leetcode.solution.easy;

/**
 * Implement strStr()
 * @author jfang
 *
 */
public class Solution028 {

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        if (needle.isEmpty())
            return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if ((haystack.length()-i >= needle.length()) 
                    && (haystack.charAt(i) == needle.charAt(0))) {
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j))
                        break;
                    if (j == needle.length() - 1)
                        return i;
                }
            }
        }
        return -1;
    }
}
