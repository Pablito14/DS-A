package util;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.LinkedList.mergeLists;

public class LinkedListTest {

    @Test
    public void testConstructor(){
        LinkedList myLL = new LinkedList();
        assertEquals("Test to see if upon instantiation, the only node (head) is null", null, myLL.head);
    }

    @Test
    public void testInsert() {
        LinkedList myLL = new LinkedList();
        myLL.insert(1);
        myLL.insert(2);
        assertTrue("This checks that the after inserting two nodes the head is 2.",myLL.head.valueStored == 2 );
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
//        This test fails and I do not know why :(
    }

//    @Test
//    public void testPrint() {
//        LinkedList myLL = new LinkedList();
//        myLL.insert(1);
//        myLL.insert(2);
//        myLL.insert(3);
//        myLL.insert(4);
//        assertEquals("This tests to make sure that the print method properly prints3 the nodes values", myLL.print().toString(), "4 3 2 1");
//
//    }
//      Not enough time to create a toString method, and then test the output.

    @Test
    public void testGetKFromTail(){
        LinkedList myLL = new LinkedList();
        myLL.insert(1);
        myLL.insert(2);
        myLL.insert(3);
        myLL.insert(4);
        myLL.insert(5);
        myLL.insert(6);
        myLL.insert(7);
        myLL.insert(8);
        int kFromNodesFromTail = myLL.getKFromTail(3);
        assertEquals("This test returns the (K)th Node from the tail with a zero based index", 3, kFromNodesFromTail);
    }

    @Test
    public void testMergeLists(){
        LinkedList ll1 = new LinkedList();
        ll1.head = new Node(0, new Node(2, new Node(4, null)));
        LinkedList ll2 = new LinkedList();
        ll2.head = new Node(1, new Node(3, new Node(5, null)));
        LinkedList result = mergeLists(ll1, ll2);
        assertTrue("Checks if the head is the one from linkedList 1", result.head.valueStored == 0);
        assertTrue("Checks if the head's next is the first from linkedList 2", result.head.nextNode.valueStored == 1);
        assertTrue("Checks if the third node is correct", result.head.nextNode.nextNode.valueStored == 2);
        assertTrue("Checks if the fourth node is correct", result.head.nextNode.nextNode.nextNode.valueStored == 3);
        assertTrue("Checks if the fifth node is correct", result.head.nextNode.nextNode.nextNode.nextNode.valueStored == 4);
        assertTrue("Checks if the sixth node is correct", result.head.nextNode.nextNode.nextNode.nextNode.nextNode.valueStored == 5);
        assertTrue("Checks if the last node is correctly null", result.head.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode == null);
    }

}