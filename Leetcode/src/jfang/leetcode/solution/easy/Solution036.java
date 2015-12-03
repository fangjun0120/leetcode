package jfang.leetcode.solution.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Valid Sudoku
 * @author jfang
 *
 */
public class Solution036 {

    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<Character>();
        
        // validate rows
        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch >= '1' && ch <= '9') {
                    if (set.contains(ch))
                        return false;
                    set.add(ch);
                }
                else if (ch != '.')
                    return false;
            }
        }
        
        // validate columns
        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                char ch = board[j][i];
                if (ch >= '1' && ch <= '9') {
                    if (set.contains(ch))
                        return false;
                    set.add(ch);
                }
                else if (ch != '.')
                    return false;
            }
        }
        
        // validate cells
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                set.clear();
                for (int i = row*3; i < (row+1)*3; i++)
                    for (int j = col*3; j < (col+1)*3; j++) {
                        char ch = board[j][i];
                        if (ch >= '1' && ch <= '9') {
                            if (set.contains(ch))
                                return false;
                            set.add(ch);
                        }
                        else if (ch != '.')
                            return false;
                    }
            }
        }
        return true;
    }
}
