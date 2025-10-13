import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
       Stack <Character> stack = new Stack<>();

       for (char ch: s.toCharArray()) {
        // If it's an opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch);
        }
        // If it's closing bracket, check for matching
            else {
                if (stack.isEmpty()) return false; // no opening bracket to match

                char top = stack.pop(); // get last opened bracket

                // Check if it matches 
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                        return false;
                } 
            }
        }
         // After processing, if stack is not empty, invalid
        return stack.isEmpty();
    }
}
  