package DynamicProgramming;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 0) return 0;

        int[] memos = new int[10002];

        // Sum up all nums
        for (int num : nums){
            memos[num] += num;
        }

        int last = 0;
        int secondLast = 0;

        for (int item : memos){
            int temp = last;
            last = Math.max(secondLast + item, last);
            secondLast = temp;
        }
        return last;
    }

    //O(n) - Using Memoization (top- up approach)
}
