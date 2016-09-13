package jfang.leetcode.solution.medium;

import java.util.*;

/**
 * Top K Frequent Elements
 * Created by jfang on 9/13/16.
 */
public class Solution347 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
            else {
                map.put(num, map.get(num)+1);
            }
        }
        Queue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(map.size(),
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return -1 * Integer.compare(o1.getValue(), o2.getValue());
                    }
                });
        for (Map.Entry entry: map.entrySet()) {
            heap.add(entry);
        }
        List<Integer> list = new LinkedList<Integer>();
        while (list.size() != k) {
            list.add(heap.poll().getKey());
        }
        return list;
    }
}
