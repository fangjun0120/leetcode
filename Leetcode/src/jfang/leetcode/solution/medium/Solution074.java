package jfang.leetcode.solution.medium;

/**
 * Search a 2D Matrix
 * @author jfang
 *
 */
public class Solution074 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int[] list = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            list[i]= matrix[i][0];
        int index = binarySearch(list, target);
        if (index < matrix.length && matrix[index][0] == target)
            return true;
        else
            index--;
        if (index >= 0) {
            int colIndex = binarySearch(matrix[index], target);
            if (colIndex < matrix[0].length && matrix[index][colIndex] == target)
                return true;
        }
        return false;
    }
    
    private int binarySearch(int[] list, int target) {
        int left = 0;
        int right = list.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (list[mid] == target)
                return mid;
            else if (list[mid] < target)
                left = mid+1;
            else
                right = mid-1;
        }
        return left;
    }
}
