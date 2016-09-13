package jfang.leetcode.solution.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Word Pattern
 * Created by jfang on 9/13/16.
 */
public class Solution290 {

    public boolean wordPattern(String pattern, String str) {
        String[] tokens = str.split(" ");
        char[] chars = pattern.toCharArray();
        if (tokens.length != chars.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < chars.length; i++) {
            String token = tokens[i];
            if (!map.containsKey(chars[i])) {
                if (map.containsValue(token)) {
                    return false;
                }
                map.put(chars[i], token);
            }
            else if (!map.get(chars[i]).equals(token)) {
                return false;
            }
        }
        return true;
    }
}
