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
    //O(n)

    public boolean checkPerfectNumber(int num) {
        if (num <= 1){
            return false;
        }

        int tmp = 1;

        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                tmp += i;
                if (i != num / i){
                    tmp += num /i;
                }
            }
        }
        return tmp == num;
    }
    //O(n)


    public boolean checkPerfectNumber(int num) {
        if (num % 2 != 0) return false;

        int tmp = 1;
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                tmp += i;
                tmp += num / i
            }
        }

        return tmp == num;
    }
    //O(n)

}
