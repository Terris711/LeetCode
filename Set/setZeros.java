package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setZeros {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        int row = matrix.length;
        int col = matrix[0].length;

        for (int r = 0; r < row; r++){
            for (int c = 0; c < col; c++){
                if (matrix[r][c] == 0){
                    rows.add(r);
                    cols.add(c);
                }
            }
        }

        for (int r = 0; r < row; r++){
            for (int c = 0; c < col; c++){
                if (rows.contains(r) || cols.contains(c)){
                    matrix[r][c] = 0;
                }
            }
        }
    }

    //Time Complexity: O(mn)
    //Space Complexity: O(mn)

    public void setZeroesOptimal(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int check = 0;

        //Check the 1st row has 0 or not
        while (check < col && matrix[0][check] != 0){
            check ++;
        }


        // Loop through the maxtrix, ste the otehr row and col as 0
        for (int i = 1; i < row; i++){
            for (int j = 0; j < col; j++){
                if (matrix[i][j] == 0){
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++){
            for (int j = col - 1; j >= 0; j--){
                if (matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // Set 1st entire array as 0)
        if (check < col){
            Arrays.fill(matrix[0], 0);
        }

    }

    //Time Complexity: O(mn)
    //Space Complexity: O(1)
}
