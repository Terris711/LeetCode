package Array;

public class findLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        int answer = 0;
        int count = 0;

        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] < nums[i]){
                count++;
                answer = Math.max(count, answer);
            } else {
                count = 0;
            }
        }
        return answer + 1;
    }
}
