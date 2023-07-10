public class arrangeCoin {
    public int arrangeCoins(int n) {
//        int i = 1;
//        while (n > 0) {
//            i++;
//            n -= i;
//        }
//        return i - 1;
//    }

        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = (right + left) / 2;
            int coinUsed = mid * (mid + 1) / 2;
            if (coinUsed == n) {
                return mid;
            }
            if (n < coinUsed) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            return right;
        }
    }

