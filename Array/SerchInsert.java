package Array;

public class SerchInsert {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right){
                int mid = (left + right) / 2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] < target) left = mid + 1;
                else right = mid - 1;
            }
            return left;
        }
    }
}

// O(nlogn) with java

public class Solution {
    public int SearchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.Length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target) return mid;
            if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }
}
