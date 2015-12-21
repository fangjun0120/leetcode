package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Gray Code
 * @author jfang
 * 
 * n = 3
 * 000
 * 001
 * 011
 * 010
 * ------
 * 110
 * 111
 * 101
 * 100
 * "1" + reverseLowerBits(n-1)
 */
public class Solution089 {

    public List<Integer> grayCode(int n) {
        List<Integer> result;
        if (n == 0) {
            result = new ArrayList<Integer>();
            result.add(0);
            return result;
        }
        result = grayCode(n-1);
        List<Integer> tmp = new ArrayList<Integer>();
        int highBitOne = 1 << (n-1);
        for (int i = result.size()-1; i >= 0; i--) {
            tmp.add(result.get(i) + highBitOne);
        }
        result.addAll(tmp);
        
        return result;
    }
}
