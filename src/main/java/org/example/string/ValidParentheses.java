package org.example.string;
import org.example.Verify;
import java.util.Stack;

public class ValidParentheses {

    public boolean myFirstIdea(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else if (c == '}' && stack.pop() != '{') {
                return false;
            } else if (c == ']' && stack.pop() != '[') {
                return false;
            } else if (c == ')' && stack.pop() != '(') {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        Verify.print(obj.myFirstIdea("()"), true);
        Verify.print(obj.myFirstIdea("()[]{}"), true);
        Verify.print(obj.myFirstIdea("(]"), false);
        Verify.print(obj.myFirstIdea("["), false);
        Verify.print(obj.myFirstIdea("(("), false);
        Verify.print(obj.myFirstIdea("]"), false);
    }
}
