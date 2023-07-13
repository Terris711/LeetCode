package Array;

public class sortColors {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for (int num : nums){
            arr[num]++;
        }
        int num = 0;
        while (arr[0] > 0){
            nums[num++] = 0;
            arr[0]--;
        }

        while (arr[1] > 0){
            nums[num++] = 1;
            arr[1]--;
        }

        while(arr[2] > 0){
            nums[num++] = 2;
            arr[2]--;
        }
    }
}
