package DynamicProgramming;

public class DivisorGame {
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }
    //O(1) - Constant time

    public boolean divisorGame(int n) {
        if (n == 1){
            return false;
        } else {
            return !divisorGame(n - 1);
        }
    }
    //Using DP O(n)
}
