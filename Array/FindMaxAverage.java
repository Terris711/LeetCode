package Array;

public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int average = 0;
        int maxSum = 0;

        for(int  i = 0;  i < k; i++){
            maxSum += nums[i];
        }

        int sum = maxSum;

        for (int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(sum, maxSum);
        }

        return (double)maxSum/k;
    }
}
//O(n)
