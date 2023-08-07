package Array;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int tmp = 0;
        if (num % 2 != 0){
            return false;
        } else {
            for (int i = 1; i <= num / 2; i++){
                if (num % i == 0){
                    tmp += i;
                }
            }
        }
        return tmp == num;
    }
}
