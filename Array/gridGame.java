package Array;

public class gridGame {
    public long gridGame(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int right = 0;
        int down = 0;

        for (int i = 0; i < col - 2; i++){
            down += grid[1][i];
        }

        int result = Math.max(down, right);

        for (int i = row -1; i > 0; i--){
            right -= grid[1][i-1];
            result = Math.min(result, Math.max(right, down));
        }
        return result;
    }
}
