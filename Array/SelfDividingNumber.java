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
}
