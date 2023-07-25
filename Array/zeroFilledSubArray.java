package Array;

public class zeroFilledSubArray {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long accumulate = 0;
        for (int num : nums){
            if (num == 0){
                accumulate++;
                count += accumulate;
            } else {
                accumulate = 0;
            }
        }
        return count;
    }
    //O(n)
}
