public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap(); //current element(key) + next element(value)
        for (int i = 0; i < nums2.length; i++){
            for(int j = i + 1; j < nums2.length; j++){
                if (nums2[j] > nums2[i]){
                    map.put(nums2[i], nums2[j]);
                    break;
                } else if (j == nums2.length - 1){
                    map.put(nums2[i], -1);
                }
            }
        }


        for (int i = 0; i < nums1.length; i++){
            Integer a = map.get(nums1[i]);
            if (a == null){
                nums1[i] = -1;
            } else {
                nums1[i] = a;
            }
        }
        return nums1;
    }
}
