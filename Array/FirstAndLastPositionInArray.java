package Array;

public class FirstAndLastPositionInArray {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] arr = {-1, -1};
            arr[0] = binarySearch(nums, target, true);
            if(arr[0] != -1){
                arr[1] = binarySearch(nums, target, false);
            }
            return arr;
        }

        public int binarySearch(int[] nums, int target, boolean check){
            int result = -1;
            int left = 0;
            int right = nums.length - 1;

            while (left <= right){
                int mid = (left + right) / 2;

                if (target > nums[mid]){
                    left = mid + 1;
                } else if (target < nums[mid]){
                    right = mid - 1;
                } else {
                    result = mid;
                    if (check){
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
            return result;
        }
    }
}
