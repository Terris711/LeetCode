package Math;

public class DiagonalSum{
    public int diagonalSum(int[][] mat) {
        int count = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat.length; col++){
                if (row == col || row + col == mat.length - 1){
                    count += mat[row][col];
                }
            }
        }
        return count;
    }
}
