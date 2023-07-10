public class CanPlaceFlowers {
    boolean right;
    boolean left;

        if (n == 0) {
        return true;
    }

        for (int i = 0; i < flowerbed.length; i++){
        right = false;
        left = false;

        if (flowerbed[i] == 0) {
            if ( i == 0 || flowerbed[i-1] == 0){
                left = true;
            }

            if ( i == flowerbed.length -1 || flowerbed[i+1] == 0){
                right = true;
            }

            if (left && right) {
                if (--n == 0){
                    break;
                }
                flowerbed[i] = 1;
            }
        }
    }
        return (n == 0);
  }
}
