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

public class Solution {
    public int LengthOfLastWord(string s) {
        s = s.TrimEnd();
        string[] temp = s.Split(' ');
        return temp[temp.Length - 1].Length;
    }
}

//O(n) with C#