package jfang.leetcode.solution.medium;

/**
 * Next Permutation
 * @author jfang
 *
 */
public class Solution031 {

    public void nextPermutation(int[] nums) {
        int i;
        for (i = nums.length-2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                int j = nums.length-1;
                while (nums[j] <= nums[i])
                    j--;
                swap(nums, i, j);
                break;
            }
        }
        
        for (int left = 0; left < (nums.length-1-i)/2; left++)
            swap(nums, i+1+left, nums.length-1-left);
    }
    
    private void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right]= tmp;
    }
}
