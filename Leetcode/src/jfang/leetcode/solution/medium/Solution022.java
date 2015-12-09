package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate Parentheses
 * @author jfang
 *
 */
public class Solution022 {

    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<String>();
        StringBuilder builder = new StringBuilder();
        traceback(resultList, builder, n, n);
        return resultList;
    }
    
    private void traceback(List<String> resultList, StringBuilder builder, int preNum, int sufNum) {
        if (preNum == 0) {
            StringBuilder str = new StringBuilder(builder);
            for (int i = 0; i < sufNum; i++)
                str.append(')');
            if (str.length() != 0)
                resultList.add(str.toString());
            return;
        }
        if (preNum <= sufNum) {
            builder.append('(');
            traceback(resultList, builder, preNum-1, sufNum);
            builder.deleteCharAt(builder.length()-1);
        }
        if (preNum < sufNum) {
            builder.append(')');
            traceback(resultList, builder, preNum, sufNum-1);
            builder.deleteCharAt(builder.length()-1);
        }
        return;
    }
}
