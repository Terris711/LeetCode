package Array;

public class FloodFill {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int initColor = image[sr][sc];
            int[][] answer = image;

            int[] delRow = {-1, 0 , 1 , 0};
            int[] delCol = {0, 1, 0, -1};

            dfs(sr, sc, answer, image, color, delRow, delCol, initColor);

            return answer;

        }

        public void dfs(int row, int col, int[][] answer, int[][] image, int newColor, int[] delRow, int[] delCol, int initColor) {
            answer[row][col] = newColor;

            int numRows = image.length;
            int numCols = image[0].length;

            for(int i = 0; i < 4; i ++){
                int newRow = row + delRow[i];
                int newCol = col + delCol[i];

                if (newRow >= 0 && newRow < numRows
                        && newCol >= 0 && newCol < numCols
                        && image[newRow][newCol] == initColor
                        && answer[newRow][newCol] != newColor){
                    dfs(newRow, newCol, answer, image, newColor, delRow, delCol, initColor);
                }
            }
        }

    }
    //O(n)
}
