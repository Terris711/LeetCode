package Array;

public class FindAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length; j++){
                if (image[i][j] == 1){
                    result[i][image.length - j - 1] = 0;
                } else {
                    result[i][image.length - j - 1] = 1;
                }
            }
        }
        return result;
    }
}
