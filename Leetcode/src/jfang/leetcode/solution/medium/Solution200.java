package jfang.leetcode.solution.medium;

public class Solution200 {

	public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++)
                visited[i][j] = false;
        int count = 0;
        
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && visited[i][j] == false) {
                    count++;
                    helper(grid, visited, j, i);
                }
            }
            
        return count;
    }
    
    private void helper(char[][] grid, boolean[][] visited, int col, int row) {
        if (col < 0 || col >= grid[0].length || row < 0 || row >= grid.length)
            return;
        
        if (grid[row][col] == '0' || visited[row][col])
            return;
        
        if (grid[row][col] == '1')
            visited[row][col] = true;
        
        helper(grid, visited, col+1, row);
        helper(grid, visited, col, row+1);
        helper(grid, visited, col-1, row);
        helper(grid, visited, col, row-1);
    }
}
