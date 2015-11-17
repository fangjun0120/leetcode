package jfang.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters
 * @author jfang
 *
 */
public class Solution003 {

	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.isEmpty())
			return 0;
		
		// char to index map
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int back = 0;
        int front = 0;
        int maxLen = 0;
        
        while (front < s.length()) {
        	Character c = s.charAt(front);
        	if (map.containsKey(c) && map.get(c) >= back) {
        		int len = front - back;
        		maxLen = Math.max(len, maxLen);
        		back = map.get(c) + 1;
        		map.put(c, front);
        	}
        	else {
        		map.put(c, front);
        	}
        	front++;
        }
        int len = front - back;
		return Math.max(len, maxLen);
    }
}
