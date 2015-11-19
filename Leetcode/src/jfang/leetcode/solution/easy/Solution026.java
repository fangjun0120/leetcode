package jfang.leetcode.solution.easy;

public class Solution026 {

	public int removeDuplicates(int[] A) {
        if (A.length <= 1)
            return A.length;

        int back = 1;
        int value = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] != value) {
                A[back] = A[i];
                value = A[i];
                back++;
            }
        }
        return back;
    }
}
