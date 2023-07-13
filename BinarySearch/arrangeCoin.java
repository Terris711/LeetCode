package BinarySearch;

public class arrangeCoin {

    public static void main(String[] args) {
        System.out.println(new arrangeCoin(5));
    }

    public int arrangeCoins(int n) {
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
}

