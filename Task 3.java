import java.util.Stack;

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
