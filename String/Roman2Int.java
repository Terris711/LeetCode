package String;

import java.util.HashMap;
import java.util.Map;

public class Roman2Int {
    class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> m = new HashMap<>();
            m.put('I', 1);
            m.put('V', 5);
            m.put('X', 10);
            m.put('L', 50);
            m.put('C', 100);
            m.put('D', 500);
            m.put('M', 1000);

            int result = 0;

            for(int i = 0; i < s.length(); i++){
                if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))){
                    result -= m.get(s.charAt(i));
                } else {
                    result += m.get(s.charAt(i));
                }
            }
            return result;
        }
    }
}

//O(n) with java


public class Solution {
    public int RomanToInt(string s) {
        Dictionary<char, int> romanMap = new Dictionary<char, int>(){
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000},
        };

        int result = 0;

        for (int i = 0; i < s.Length; i++){
            if (i + 1 < s.Length && romanMap[s[i]] < romanMap[s[i+1]]){
                result -= romanMap[s[i]];
            } else {
                result += romanMap[s[i]];
            }
        }
        return result;
    }
}

//O(n) with c#