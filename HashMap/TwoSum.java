package HashMap;
import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> answer = new HashMap<>();

        int n = nums.length;

        for (int i = 0; i < n; i++){
            answer.put(nums[i], i);
        }

        for (int i = 0; i < n; i++){
            int left = target - nums[i];
            if (answer.containsKey(left) && answer.get(left) != i){
                return new int[]{i, answer.get(left)};
            }
        }
        return new int[]{};
    }
}

