import org.junit.Test;
import static org.junit.Assert.*;

public class ParenthesisCheckerTest {

    @Test
    public void testEmptyInput() {
        assertTrue(ParenthesisChecker.hasValidParentheses("")); 
    }

    @Test
    public void testSimpleMatchedPairs() {
        assertTrue(ParenthesisChecker.hasValidParentheses("()"));
        assertTrue(ParenthesisChecker.hasValidParentheses("()()"));
        assertTrue(ParenthesisChecker.hasValidParentheses("(())"));
    }

    @Test
    public void testMultipleNestedPairs() {
        assertTrue(ParenthesisChecker.hasValidParentheses("((()))"));
        assertTrue(ParenthesisChecker.hasValidParentheses("(()())"));
    }

    @Test
    public void testMismatchedPairs() {
        assertFalse(ParenthesisChecker.hasValidParentheses(")("));
        assertFalse(ParenthesisChecker.hasValidParentheses("())"));
        assertFalse(ParenthesisChecker.hasValidParentheses("(()))"));
    }

    @Test
    public void testUnclosedOpeningBracket() {
        assertFalse(ParenthesisChecker.hasValidParentheses("(()"));
        assertFalse(ParenthesisChecker.hasValidParentheses("((()"));
    }

    @Test
    public void testOtherCharacters() {
        assertTrue(ParenthesisChecker.hasValidParentheses("a(b)c"));
        assertFalse(ParenthesisChecker.hasValidParentheses("a(b)c)"));
        assertFalse(ParenthesisChecker.hasValidParentheses("(a(b)c"));
    }
}

