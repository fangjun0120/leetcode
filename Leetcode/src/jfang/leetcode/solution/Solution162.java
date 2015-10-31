package jfang.leetcode.solution;

public class Solution162 {

	public int findPeakElement(int[] num) {
        int len = num.length;
        int left = 0;
        int right = len-1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((mid == 0 || num[mid] > num[mid-1]) && (mid == len-1 || num[mid] > num[mid+1]))
                return mid;
                
            if (mid > 0 && num[mid] < num[mid-1]) {
                right = mid - 1;
            }
            else if (mid < len-1 && num[mid] < num[mid+1]) {
                left = mid + 1;
            }
        }
        
        return -1;
    }
}
