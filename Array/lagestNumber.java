package Array;

import java.util.Arrays;

public class lagestNumber {
    public String largestNumber(int[] nums) {
        int count = 0;
        String answer = "";

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                count++;
            }
        }

        if(count == 0){
            return "0";
        }

        String[] string = new String [nums.length];
        for (int i = 0; i < nums.length; i++){
            string[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(string, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // for (int i = 0; i < nums.length; i++){
        //     for (int j = i + 1; j < nums.length; j++){
        //         String str1 = string[i];
        //         String str2 = string[j];
        //         String comp1 = str1 + str2;
        //         String comp2 = str2 + str1;

        //         if(comp1.compareTo(comp2) < 0){
        //             String temp = string[i];
        //             string[i] = string[j];
        //             string[j] = temp;
        //         }
        //     }
        // }

        for (int i = 0; i < nums.length; i++){
            answer += string[i];
        }
        return answer;
    }
}
