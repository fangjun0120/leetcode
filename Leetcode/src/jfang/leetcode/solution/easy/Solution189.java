package jfang.leetcode.solution.easy;

public class Solution189 {

	public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, n-1, 0);
        reverse(nums, k-1, 0);
        reverse(nums, n-1, k);
    }
    
    private void reverse(int[] nums, int front, int back) {
        while (front > back) {
            int tmp = nums[front];
            nums[front] = nums[back];
            nums[back] = tmp;
            front--;
            back++;
        }
    }
}
