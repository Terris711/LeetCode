package Array;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++){
            int temp = i;
            int first = 0;
            int last = 0;

            while (temp > 0){
                first++;
                int lastDigit = temp % 10;
                if (lastDigit != 0 && i % lastDigit == 0){
                    last ++;
                }
                temp /= 10;
            }
            if (first == last){
                list.add(i);
            }
        }
        return list;
    }

    //O(n)

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList();
        for (int i = left; i <= right; i++){
            if (isSelfDividingNumber(i)){
                answer.add(i);
            }
        }
        return answer;
    }

    private boolean isSelfDividingNumber(int number){
        int temp = number;
        while (temp != 0){
            int divisor = temp % 10;
            if (divisor == 0 || number % divisor != 0){
                return false;
            }
            temp /= 10;
        }
        return true;
    }
    //O(n^2)
}
