package HashMap;

public class longestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            set.add(num);
        }

        int count = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)){
                int length = 0;
                while (set.contains(num + length)){
                    length += 1;
                }

                count = Math.max(count, length);
            }
        }
        return count;
    }
}
