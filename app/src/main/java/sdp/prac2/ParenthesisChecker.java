import java.util.Stack;

public class ParenthesisChecker {

    /**
     * Checks if a string has a matching number of ( and ) brackets,
     * and if they are correctly nested.
     */
    public static boolean hasValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c); // Push opening bracket onto stack
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // Unmatched or incorrect nesting
                }
            }
        }

        return stack.isEmpty(); // All brackets should be matched
    }
}