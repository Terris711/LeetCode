package Array;

public class LengthOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            String string = s.trim();
            s = s.trim();
            int count = 0;
            int i = s.length() - 1;
            while (i >= 0 && string.charAt(i) != ' '){
                count++;
                i--;
            }
            return count;
        }
    }
}

// O(n) Java