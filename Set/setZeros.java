package Set;

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
}
