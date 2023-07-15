package Array;

public class RangeSumQuery  {

    //Using O(n) time complexity
    class NumArray {

        private int[] arr;

        public NumArray(int[] nums) {
            this.arr = nums;
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for (int i = left; i <= right; i++){
                sum += arr[i];
            }
            return sum;
        }
    }
}
