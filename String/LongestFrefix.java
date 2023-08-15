package String;

import java.util.Arrays;

public class LongestFrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0){
                return "";
            }

            Arrays.sort(strs);
            String start = strs[0];
            String end = strs[strs.length - 1];

            int index = 0;
            while (index < start.length() && index < end.length()){
                if (start.charAt(index) == end.charAt(index)){
                    index++;
                } else {
                    break;
                }
            }
            return start.substring(0,index);
        }
    }
}
