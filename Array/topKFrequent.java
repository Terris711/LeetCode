package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topKFrequent {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i : nums) {
                if (map.containsKey(i)){
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }

            List<Integer> list = new ArrayList<>(map.keySet());

            // Sort list in descending order
            list.sort((a,b) -> map.get(b) - map.get(a));

            int answer[] = new int[k];
            for (int i = 0; i < k; i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}

// O(NlogN)
