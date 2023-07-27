package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionArrayI {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> tmp = new HashSet<>();

        for (int i : nums1){
            set1.add(i);
        }

        for (int j : nums2){
            set2.add(j);
        }

        for (Integer i : set1){
            if (set2.contains(i)){
                tmp.add(i);
            }
        }

        int[] answer = new int[tmp.size()];
        int index = 0;
        for (Integer i : tmp){
            answer[index++] = i;
        }
        return answer;
    }

    //O(n)

    public int[] intersectI(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        //Count occurences of array items
        for (int i : nums1){
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int i : nums2){
            int count = map.getOrDefault(i,0);
            if (count > 0){
                result.add(i);
            }
            map.put(i, count - 1);
        }

        int[] answer = new int[result.size()];
        int index = 0;
        for (Integer i : result){
            answer[index++] = i;
        }
        return answer;
    }
    //O(n)
}
