package jfang.leetcode.solution;

public class Solution080 {

	public int removeDuplicates(int[] A) {
        if (A.length <= 2)
            return A.length;

        int back = 2;
        int value1 = A[0];
        int value2 = A[1]; 
        for (int i = 2; i < A.length; i++) {
            if (A[i] != value2 || A[i] != value1) {
                value2 = A[i];
                value1 = A[i-1];
                A[back] = A[i];
                back++;
            }
            else {
                value2 = A[i];
                value1 = A[i-1];
            }
        }
        return back;
    }
}
