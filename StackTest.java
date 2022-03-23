/**
    @author Nadia Goralski
 */

import java.util.Stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

// Note that you don't need a main method in order for JUnit to run
public class StackTest {

    @Test
    @DisplayName("Test adding to the stack")
    public void addToStack() {
        Stack<Integer> testStack = new Stack<Integer>();
        int[] numbers = {0, 1, 2, 3};

        int expectedStackSize = 0;

        // test if the stack is empty
        assertTrue(testStack.empty(), "Stack should be empty");

        for (int i = 0; i < numbers.length; i++){
            testStack.push(numbers[i]);
            expectedStackSize += 1;

            // first arg: expected value
            // second arg: actual value
            // third arg: error message (if test fails)
            assertEquals(numbers[i], testStack.get(i), String.format("Top of the stack should be %d", numbers[i]));
            assertEquals(expectedStackSize, testStack.size(), String.format("Stack size should be %d", expectedStackSize));
        }

        // at the end of the for loop, the stack should be populated. We can test that by using:
        assertFalse(testStack.empty(), "Stack should not be empty");

        // demo below for failed test
        // assertEquals(3, testStack.size(), "Stack should have the size of 4");
    }
}