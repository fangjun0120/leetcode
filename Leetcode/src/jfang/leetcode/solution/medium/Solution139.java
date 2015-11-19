package jfang.leetcode.solution.medium;

import java.util.Set;

public class Solution139 {

	public boolean wordBreak(String s, Set<String> dict) {
        int len = s.length();
        boolean[] flag = new boolean[len+1];
        for (int i = 0; i < len+1; i++)
            flag[i] = false;
        flag[0] = true;
        
        for (int i = 1; i < len+1; i++) {
            for (int j = i-1; j >= 0; j--) {
                String word = s.substring(j, i);
                if (flag[j] && dict.contains(word)) {
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[len];
    }
}
