package jfang.leetcode.test;

import jfang.leetcode.solution.medium.Solution001;

public class Test001 {

	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		Solution001 solution = new Solution001();
		int[] res = solution.twoSum(numbers, target);
		System.out.print(res[0] + ", " + res[1]);
	}
}
