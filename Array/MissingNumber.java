package Array;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int answer;
        int count = 0;
        int n = nums.length;

        answer = n*(n+1)/2;

        for (int i = 0; i < n; i++){
            count += nums[i];
        }
        return answer - count;
    }
}
