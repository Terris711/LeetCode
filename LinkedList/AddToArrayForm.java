package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> answer = new LinkedList<>();

        for (int i = num.length - 1; i >= 0; i--){
            answer.add(0, (num[i] + k) % 10 );
            k = (num[i] + k) / 10;
        }

        while (k > 0){
            answer.add(0, k % 10);
            k = k / 10;
        }

        return answer;
    }

    //O(n)
    //Space O(n)
}
