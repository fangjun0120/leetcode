package jfang.leetcode.solution.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution140 {

	public List<String> wordBreak(String s, Set<String> dict) {
        List<String> res = new ArrayList<String>();
        
        // create an index list 
        List<Integer>[] index_list = new ArrayList[s.length()+1];
        index_list[s.length()] = new ArrayList<Integer>();
        
        for (int i = s.length()-1; i >= 0; i--) {
            for (int j = i+1; j <= s.length(); j++) {
                if (index_list[j] != null && dict.contains(s.substring(i, j))) {
                    if (index_list[i] == null)
                        index_list[i] = new ArrayList();
                    index_list[i].add(j);
                }
            }
        }
    
        // no solution found
        if (index_list[0] == null)
            return res;
            
        // collect all possible combinations
        List<List<String>> lists = new ArrayList<>();
        createString(lists, new ArrayList<String>(), index_list, s, 0);
    
        // concatenate to a string
        for (List<String> list: lists)
            res.add(concatStrings(list));
            
        return res;
    }
    
    private void createString(List<List<String>> lists, List<String> cur, List<Integer>[] index_list, String s, int index) {
        if (index_list[index].size() == 0) {
            lists.add(new ArrayList<String>(cur));
            return;
        }
        
        for (int j: index_list[index]) {
            cur.add(s.substring(index, j));
            createString(lists, cur, index_list, s, j);
            cur.remove(cur.size()-1);
        }
        return;
    }
    
    private String concatStrings(List<String> strings) {
        StringBuilder buffer = new StringBuilder();
        String sep = " ";
        for(String s: strings)
            buffer.append(sep).append(s);
        
        return buffer.toString().trim();                           
    }
}
