/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class AppTest {
      public void testTask2() {
        // Arrange
        List<String> inputList = Arrays.asList("Hello", "World", "", "Java");
        List<String> expected = Arrays.asList("ello", "orld", "ava");

        // Act
        List<String> actual = SimpleFunctions.Task2(inputList);

        // Assert
        assertEquals(expected, actual, "The method should remove the first character from each non-empty string.");
    }

    @Test
    public void testsForTask3 (){
        String first = "((((((((((((((((((((((((((((()))))))))))))))))))))))))))))";
        String second = "(((((((((((gbadf(((((((((((((((((((((((vdf)afbjaipd)))))))))gbisjv))))))))))))))))";

        assert Task3("()")=true;
        assert Task3("(")=false;
        assert Task3(first)=true;
        assert Task3(second)=false;
    }//the neames make the test slightly heavy but make referencing easier they are used and the many number of brackets are t make sure that the program can keep track and the first is just for conrtrol 
    
    public void testTask5() {
        // Test cases
        int[] sortedArray = {1, 2, 3, 4, 5};       // True
        int[] unsortedArray = {1, 3, 2, 4, 5};     // False
        int[] singleElementArray = {42};           // True
        int[] emptyArray = {};                     // True
        int[] nullArray = null;                    // True
        
        // Assertions
        assertTrue(SimpleFunctions.Task5(sortedArray));  // should be true
        assertFalse(SimpleFunctions.Task5(unsortedArray));  // should be false
        assertTrue(SimpleFunctions.Task5(singleElementArray));  // should be true
        assertTrue(SimpleFunctions.Task5(emptyArray));  // should be true
        assertTrue(SimpleFunctions.Task5(nullArray));  // should be true
    }

    public void testTask4() {
        // Test cases
        List<Integer> list1 = Arrays.asList(3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(5, 8, 9, 10);
        List<Integer> expectedResult = Arrays.asList(30, 36, 40, 30);

        List<Integer> result = SimpleFunctions.task4(list1, list2);
        assertEquals(expectedResult, result);

        // Test case with different length lists
        List<Integer> list3 = Arrays.asList(1, 2, 3);
        List<Integer> list4 = Arrays.asList(4, 5, 6, 7);

        assertNull(SimpleFunctions.task4(list3, list4));
    }


}
