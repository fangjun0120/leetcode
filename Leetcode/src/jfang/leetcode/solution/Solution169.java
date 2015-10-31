package jfang.leetcode.solution;

public class Solution169 {

	public int majorityElement(int[] num) {
        int maj_index = 0;
        int count = 1;
        for(int i = 1; i < num.length; i++) {
            if(num[maj_index] == num[i])
                count++;
            else
                count--;
            if(count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return num[maj_index];
    }
}
