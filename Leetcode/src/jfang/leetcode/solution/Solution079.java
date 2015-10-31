package jfang.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class Solution079 {

	public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j< cols; j++) {
                if (helper(board, i, j, word, 0, new HashSet<Integer>()))
                    return true;
            }
            
        return false;
    }
    
    private boolean helper(char[][] board, int row, int col, String word, int pos, Set<Integer> visited) {
        if (row < 0 || row > board.length-1 || col < 0 || col > board[0].length-1)
            return false;
        int key = board[0].length*row + col;
        if (visited.contains(key))
            return false;
        if (board[row][col] != word.charAt(pos))
            return false;
        if (pos == word.length()-1)
            return true;
            
        visited.add(key);
        if (helper(board, row-1, col, word, pos+1, visited))
            return true;
        if (helper(board, row+1, col, word, pos+1, visited))
            return true;
        if (helper(board, row, col-1, word, pos+1, visited))
            return true;
        if (helper(board, row, col+1, word, pos+1, visited))
            return true;
            
        visited.remove(key);
        return false;
    }
}
