package jfang.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution015 {

	public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = num.length;
        if (len < 3)
            return res;
            
        Arrays.sort(num);
        for (int i = 0; i < len-2; i++) {
            if (i != 0 && num[i] == num[i-1])
                continue;
            int left = i+1;
            int right = len-1;
            while (left < right) {
                int sum = num[i] + num[left] + num[right];
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(num[i]);
                    triplet.add(num[left]);
                    triplet.add(num[right]);
                    res.add(triplet);
                    left++;
                    right--;
                    while (left < right && num[left] == num[left-1])
                        left++;
                    while (right > left && num[right] == num[right+1])
                        right--;
                }
                else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        
        return res;
    }
}
