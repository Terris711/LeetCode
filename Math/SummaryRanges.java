package Math;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if(nums.length == 1){
            answer.add(nums[0]+"");
            return answer;
        }

        for (int i = 0; i < nums.length; i++){
            int temp = nums[i];

            while (i + 1 < nums.length && (nums[i+1] - nums[i]) == 1){
                i++;
            }

            if (temp!= nums[i]){
                answer.add(temp + "->" + nums[i]);
            } else {
                answer.add(temp +"");
            }
        }
        return answer;
    }
    //O(n)
}
