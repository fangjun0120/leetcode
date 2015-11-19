package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution187 {

	public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        
        if (s.length() <= 10)
            return res;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int seq = 0;
        for (int i = 0; i < 10; i++)
            seq = shiftOne(seq, s.charAt(i));
        map.put(seq, 1);
        
        for (int i = 10; i < s.length(); i++) {
            seq = shiftOne(seq, s.charAt(i));
            String seqs = s.substring(i-9, i+1);
            if (map.containsKey(seq)) {
                if (map.get(seq) == 1) {
                    res.add(seqs);
                    map.put(seq, -1);
                }
            }
            else 
                map.put(seq, 1);
        }
        
        return res;
    }
    
    private int shiftOne(int seq, char c) {
        int blank = (1 << 20) - 1;
        seq = (seq << 2) & blank;
        int low = 0;
        if (c == 'A')
            low = 0;
        else if (c == 'C')
            low = 1;
        else if (c == 'G')
            low = 2;
        else if (c == 'T')
            low = 3;
        seq = seq | low;
        return seq;
    }
}
