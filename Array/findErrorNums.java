package Array;

import java.util.HashSet;

public class findErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int num : nums){
            if (set.contains(num)){
                answer[0] = num;
            } else {
                set.add(num);
                sum += num;
            }
        }

        answer[1] = (n*(n+1)/2) - sum;

        return answer;
    }
}
