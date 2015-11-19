package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Letter Combinations of a Phone Number
 * @author jfang
 *
 */
public class Solution017 {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty())
            return new ArrayList<String>();
        List<String> res = new ArrayList<String>();
        Map<Character, String> digitMap = new HashMap<Character, String>();
        digitMap.put('0', " ");
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");
        traceBackMethod(res, new StringBuilder(), digits, 0, digitMap);
        return res;
    }
    
    private void traceBackMethod(List<String> res, StringBuilder builder, 
            String digits, int index, Map<Character, String> digitMap) {
        if (index == digits.length()) {
            res.add(builder.toString());
            return;
        }
        String chars = digitMap.get(digits.charAt(index));
        for (Character c: chars.toCharArray()) {
            builder.append(c);
            traceBackMethod(res, builder, digits, index+1, digitMap);
            builder.deleteCharAt(builder.length()-1);
        }
    }
}
