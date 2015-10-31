package jfang.leetcode.solution;

public class Solution165 {

	public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        
        int len = Math.min(s1.length, s2.length);
        
        int i = 0;
        for (i = 0; i < len; i++) {
            int i1 = Integer.parseInt(s1[i]);
            int i2 = Integer.parseInt(s2[i]);
            
            if (i1 < i2)
                return -1;
            if (i1 > i2)
                return 1;
        }
        
        // case "1.0.0" == "1"
        String[] s = null;
        int res = 0;
        if (s1.length > len) {
            s = s1;
            len = s1.length;
            res = 1;
        }
        if (s2.length > len) {
            s = s2;
            len = s2.length;
            res = -1;
        }
        while (i < len) {
            if (Integer.parseInt(s[i]) != 0)
                return res;
            i++;
        }   
        
        return 0;
    }
}
