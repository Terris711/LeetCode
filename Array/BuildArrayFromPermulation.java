package Array;

public class BuildArrayFromPermulation {
    class Solution {
        public int[] buildArray(int[] nums) {
            int[] result = new int[nums.length];

            for(int i = 0; i < result.length; i++){
                result[i] = nums[nums[i]];
            }
            return result;
        }
    }
}

//O(n)
