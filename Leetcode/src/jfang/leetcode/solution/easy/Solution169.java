package jfang.leetcode.solution.easy;

/**
 * Majority Element
 * Boyer–Moore majority vote algorithm from wiki
 * @author jfang
 *
 */
public class Solution169 {

	public int majorityElement(int[] nums) {
	    int n = nums.length;
        int candidate = nums[0];
        int counter = 0;
        
        // cancel out if the element is different from the candidate
        for (int i: nums) {
            if (counter == 0) {
                candidate = i;
                counter = 1;
            } else if (candidate == i) {
                counter++;
            } else {
                counter--;
            }
        }

        // check if candidate is the major element
        counter = 0;
        for (int i : nums) {
            if (i == candidate) 
                counter++;
        }
        if (counter < (n + 1) / 2) 
            return -1;
        
        return candidate;
    }
}
