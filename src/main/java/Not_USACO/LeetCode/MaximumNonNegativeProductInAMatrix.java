package Not_USACO.LeetCode;

/**
 * You are given a rows x cols matrix grid. Initially, you are located at the top-left corner (0, 0), and in each step, you can only move right or down in the matrix.
 *
 * Among all possible paths starting from the top-left corner (0, 0) and ending in the bottom-right corner (rows - 1, cols - 1), find the path with the maximum non-negative product. The product of a path is the product of all integers in the grid cells visited along the path.
 *
 * Return the maximum non-negative product modulo 109 + 7. If the maximum product is negative return -1.
 */
public class MaximumNonNegativeProductInAMatrix {
    public int maxProductPath(int[][] grid) {
        max = Long.MIN_VALUE;
        max(grid, 0, 0, 1);
        if(max < 0) {
            if(isZero) return 0;
            return -1;
        }
        return (int) (max % (long)(Math.pow(10,9) + 7));
    }

    long max;
    boolean isZero = false;
    private void max(int[][] grid, int i, int j, long val){
        if(grid[i][j] == 0) {
            isZero = true;
            return;
        }
        if(i == grid.length - 1 && j == grid[0].length - 1) {
            val *= grid[i][j];
            max = Math.max(max, val);
        }
        val = val * grid[i][j];

        if(i < grid.length - 1) max(grid, i + 1, j, val);
        if(j < grid[0].length - 1) max(grid, i, j + 1, val);
    }
}
