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

public class Solution {
    public int[] buildArray(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            nums[i] += (nums[nums[i]] % nums.length) * nums.length;
        }

        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] / nums.length;
        }
        return nums;
    }
}

public class Solution {
    public int[] BuildArray(int[] nums) {
        int [] arr = new int[nums.Length];

        for (int i = 0; i < nums.Length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
// C#

public class Solution {
    public int[] BuildArray(int[] nums) {
        for (int i = 0; i < nums.Length; i++){
            nums[i] += (nums[nums[i]] % nums.Length) * nums.Length;
        }

        for (int i = 0; i < nums.Length; i++){
            nums[i] = nums[i] / nums.Length;
        }
        return nums;
    }
}

// C# optimal
