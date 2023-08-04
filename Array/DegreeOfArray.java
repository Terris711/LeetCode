package Array;

import java.util.HashMap;

public class DegreeOfArray {
    public int findShortestSubArray(int[] nums) {
        HashMap <Integer, Integer> occurences = new HashMap<>();
        HashMap <Integer, Integer> first_occurrence = new HashMap<>();

        int degree = 0;
        int minLen = 0;

        for (int i = 0; i < nums.length; i++){
            first_occurrence.putIfAbsent(nums[i], i);
            occurences.put(nums[i], occurences.getOrDefault(nums[i], 0) + 1);

            if (occurences.get(nums[i]) > degree){
                degree = occurences.get(nums[i]);
                minLen = i - first_occurrence.get(nums[i]) + 1;
            } else if (occurences.get(nums[i]) == degree){
                minLen = Math.min(minLen, i - first_occurrence.get(nums[i]) + 1);
            }
        }
        return minLen;
    }
}
