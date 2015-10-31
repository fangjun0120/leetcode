package jfang.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class Solution001 {

	public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        
        for (int i = 0; i < numbers.length; i++) {
            int value = target - numbers[i];
            if (map.containsKey(value)) {
                res[0] = map.get(value)+1;
                res[1] = i+1;
            }
            map.put(numbers[i], i);
        }
        return res;
    }
}
