package jfang.leetcode.solution.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Valid Anagram
 * @author jfang
 *
 */
public class Solution242 {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character c: s.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            }
            else {
                map.put(c, 1);
            }
        }
        for (Character c: t.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, --count);
            }
            else {
                return false;
            }
        }
        for (Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }
        return true;
    }
}
