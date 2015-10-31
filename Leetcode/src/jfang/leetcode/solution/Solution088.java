package jfang.leetcode.solution;

public class Solution088 {

	public void merge(int A[], int m, int B[], int n) {
        int[] AA = new int[m];
        for (int i = 0; i < m; i++)
            AA[i] = A[i];
            
        int aa = 0;
        int a = 0;
        int b = 0;
        
        while (aa < m && b < n) {
            if (AA[aa] < B[b]) {
                A[a] = AA[aa];
                aa++;
            }
            else {
                A[a] = B[b];
                b++;
            }
            a++;
        }
        if (aa == m) {
            while (b < n) {
                A[a] = B[b];
                b++;
                a++;
            }
        }
        if (b == n) {
            while (aa < m) {
                A[a] = AA[aa];
                aa++;
                a++;
            }
        }
    }
}
