package Array;

import java.util.Arrays;

public class MinimunDifference {
    public int minimumDifference(int[] nums, int k) {
        if ( k > nums.length){
            return -1;
        }
        Arrays.sort(nums);
        int difference = nums[k-1] - nums[0];

        for(int i = k; i < nums.length; i++){
            difference = Math.min(nums[i] - nums[i-k + 1], difference);
        }
        return difference;
    }
}
