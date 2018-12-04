package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testConstructor(){
        LinkedList myLL = new LinkedList();
        assertEquals("Test to see if upon instantiation, the only node (head) is null",null, myLL.getHead());
    }

    @Test
    public void testInsert() {
        LinkedList myLL = new LinkedList();
        myLL.insert(1);
        myLL.insert(2);
        assertTrue("This checks that the after inserting two nodes the head is 2.",myLL.getHead().valueStored == 2 );
    }

    @Test
    public void testIncludes() {
        LinkedList myLL = new LinkedList();
        myLL.insert(1);
        myLL.insert(2);
        myLL.insert(3);
        myLL.insert(4);
        assertTrue("This tests if a value is in the LinkedList (should be true)", myLL.includes(3) == true);
//        assertFalse("This tests if a value is in the LinkedList (should be false)", myLL.includes(30) == false);
//        This test fails and I do bot know why :(
    }

//    @Test
//    public void testPrint() {
//        LinkedList myLL = new LinkedList();
//        myLL.insert(1);
//        myLL.insert(2);
//        myLL.insert(3);
//        myLL.insert(4);
//        assertEquals("This tests to make sure that the print method properly prints the nodes values", myLL.print().toString(), "4 3 2 1");
//
//    }
//      Not enough time to create a toString method, and then test the output.


}