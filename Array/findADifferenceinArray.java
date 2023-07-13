package Array;

public class findADifferenceinArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> check1 = new HashSet<>();
        Set<Integer> check2 = new HashSet<>();
        for (int item : nums1){
            check1.add(item);
        }

        for (int item : nums2){
            check2.add(item);
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());

        for (int item : check1){
            if (!check2.contains(item)){
                answer.get(0).add(item);
            }
        }

        for (int item : check2){
            if (!check1.contains(item)){
                answer.get(1).add(item);
            }
        }
        return answer;
    }
}
