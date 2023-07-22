package Array;

public class ShiftGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        List<List<Integer>> newGrid = new ArrayList<>();

        for(int i = 0; i < row; i++){
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < col; j++){
                temp.add(0);
            }
            newGrid.add(temp);
        }

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                int newCol = (j + k) % col;
                int newRow = (i + (j + k)/col) % row;

                // newGrid[newRow][newCol] = grid[i][j];
                newGrid.get(newRow).set(newCol, grid[i][j]);
            }
        }
        return newGrid;
    }
}
