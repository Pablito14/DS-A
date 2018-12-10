package StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testPush() {
        Stack testy = new Stack();
        assertEquals("This tests if we are creating an empty Stack.", testy.peek(), null);
        testy.push(1);
        assertEquals("This tests if we are adding values correctly.", testy.peek().valueStored, 1);
        testy.push(0);
        assertEquals("This tests if we are adding values correctly.", testy.peek().valueStored, 0);
        testy.push(-1);
        assertEquals("This tests if we are adding values correctly.", testy.peek().valueStored, -1);
    }

    @Test
    public void testPop() {
        Stack testy = new Stack(1);
        testy.push(2);
        testy.push(-3);
        testy.push(0);
        int value = testy.pop();
        assertEquals("This test checks to see if we extract the top nodes value correctly.", 0, value);
        value = testy.pop();
        assertEquals("This test checks to see if we extract the top nodes value correctly.", -3, value);
        value = testy.pop();
        assertEquals("This test checks to see if we extract the top nodes value correctly.", 2, value);
        value = testy.pop();
        assertEquals("This test checks to see if we extract the top nodes value correctly.", 1, value);
    }

    @Test
    public void testPeek() {
        Stack testy = new Stack(1);
        testy.push(2);
        testy.push(-3);
        testy.push(0);
        int value = testy.peek().valueStored;
        assertEquals("This test checks to see if we can view the top nodes value correctly.", 0, value);
    }
}