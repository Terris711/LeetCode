package String;

import java.util.Stack;

public class SimplifyPath {
    class Solution {
        public String simplifyPath(String path) {
            Stack<String> stack = new Stack<String>();

            for (String s : path.split("/")){
                if (s.equals("..")){
                    if (!stack.empty()) stack.pop();
                } else if (!s.equals(".") && !s.equals("")){
                    stack.push(s);
                }
            }
            return "/" + String.join("/", stack);
        }
    }
}

//O(n)