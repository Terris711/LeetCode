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

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        int[] res = new int[k];

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (k == 0) break;
            List<Integer> li = buckets[i];
            if (li == null) continue;
            for (Integer ans : li) {
                res[k - 1] = ans;
                k--;
            }

        }
        return res;
    }
}

//O(N)
