package jfang.leetcode.solution.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * ZigZag Conversion
 * @author jfang
 *
 */
public class Solution006 {

    // assume numRows is a positive number
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        
        List<StringBuilder> builders = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) {
            StringBuilder builder = new StringBuilder();
            builders.add(builder);
        }
        
        for (int i = 0; i < s.length(); i++) {
            int mode = i % (2*numRows-2);
            if (mode >= numRows) 
                mode = numRows*2-2 - mode;
            builders.get(mode).append(s.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        for (StringBuilder builder: builders) {
            result.append(builder);
        }
        return result.toString();
    }
}
