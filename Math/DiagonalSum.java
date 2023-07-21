package Math;

public class DiagonalSum{

    //O(n^2)
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

    // O(n)
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++){
            sum = sum + mat[i][i];
            if (n - i - 1 != i){
                sum += mat[i][n-i-1];
            }
        }
        return sum;
    }

}
