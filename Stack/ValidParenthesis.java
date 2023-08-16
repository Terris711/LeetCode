package Stack;

import java.util.Stack;

public class ValidParenthesis {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();
            for(char c : s.toCharArray()){
                if (c == '(') stack.push(')');
                else if (c == '{') stack.push('}');
                else if (c == '[') stack.push(']');
                else if (stack.isEmpty() || stack.pop() != c) return false;
            }
            return stack.isEmpty();
        }
    }
}

//O(n) with Java

public class Solution {
    public bool IsValid(string s) {
        Stack<char> stack = new Stack<char>();

        foreach (char c in s){
            if (c == '(') stack.Push(')');
            else if (c == '[') stack.Push(']');
            else if (c == '{') stack.Push('}');
            else if (stack.Count == 0 || stack.Pop() != c) return false;
        }
        return stack.Count == 0;
    }
}
//O(n) with C#
