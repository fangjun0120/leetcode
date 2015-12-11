package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Group Anagrams
 * @author jfang
 *
 */
public class Solution049 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Arrays.sort(strs);
        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String ascString = new String(chars);
            if (!map.containsKey(ascString))
                map.put(ascString, new ArrayList<String>());
            map.get(ascString).add(str);
        }
        List<List<String>> result = new ArrayList<List<String>>();
        for (Entry<String, List<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}
