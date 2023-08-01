package String;

import java.util.Arrays;

public class FindLHS {
    public int findLHS(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int result = 0;

        while (right < nums.length){
            int diff = nums[right] - nums[left];
            if (diff == 1){
                result = Math.max(result, right - left + 1);
            }

            if(diff <= 1){
                right++;
            } else {
                left++;
            }
        }
        return result;
    }
}

//O(n)
