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
            String end s= strs[strs.length - 1];

            int index = 0;
            while (index < ==start.length() && index < end.length()){
                if (start.charAt(index) == end.charAt(index)){
                    index++;
                } else {
                    break;
                }
            }
            return start.substring(0,index);
        }
    }
    //O(n) with java
}


public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        if (strs.Length == 0) return "";

        string prefix = "";

        for (int i = 0; i < strs[0].Length; i++){
            foreach(string str in strs){
                if (i > str.Length - 1) return prefix;
                if (strs[0][i] != str[i]) return prefix;
            }
            prefix += strs[0][i];
        }
        return prefix;
    }
}