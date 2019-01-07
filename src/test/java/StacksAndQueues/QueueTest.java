//package StacksAndQueues;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class QueueTest {
//
//    @Test
//    public void testGetFront() {
//        Queue testy = new Queue(1);
//        testy.enqueue(7);
//        assertEquals("This tests if the getter for the front value is working", 1, testy.getFront().valueStored);
//    }
//
//    @Test
//    public void testGetRear() {
//        Queue testy = new Queue(1);
//        testy.enqueue(7);
//        assertEquals("This tests if the getter for the rear value is working.", 7, testy.getRear().valueStored);
//    }
//
//    @Test
//    public void testEnqueue() {
//        Queue testy = new Queue(1);
//        testy.enqueue(7);
//        testy.enqueue(2018);
//        assertEquals("This tests if we are queueing the number to the end.", 2018, testy.getRear().valueStored);
//    }
//
//    @Test
//    public void testDequeue() {
//        Queue testy = new Queue(1);
//        testy.enqueue(7);
//        testDequeue();
//        assertEquals("This tests if we are un-queueing the correct number off the end.", 7, testy.getRear().valueStored);
//    }
//
//    @Test
//    public void testPeek() {
//        Queue testy = new Queue(1);
//        testy.enqueue(7);
//        assertEquals("This tests if the getter for the rear value is working", 7, testy.getRear().valueStored);
//    }
//}