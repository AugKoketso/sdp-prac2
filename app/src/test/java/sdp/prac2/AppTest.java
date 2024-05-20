/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class AppTest {
    @Test
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
    


}
