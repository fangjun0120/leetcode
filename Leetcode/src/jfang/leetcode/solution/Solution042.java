package jfang.leetcode.solution;

public class Solution042 {

	public int trap(int[] A) {
        int[] left_max = new int[A.length];
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            left_max[i] = max;
            if (A[i] > max)
                max = A[i];
        }
        
        int sum = 0;
        max = 0;
        for (int i = A.length-1; i >= 0; i--) {
            if (A[i] < left_max[i] && A[i] < max)
                sum += Math.min(left_max[i], max) - A[i];
            if (A[i] > max)
                max = A[i];
        }
        
        return sum;
    }
}
