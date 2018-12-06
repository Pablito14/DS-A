package util;
import java.util.ArrayList;

public class LinkedList {

    /*Instance Variables*/
    private Node head;

    /*Getters*/
    public Node getHead(){return this.head;}

    /*Constructor*/
    public LinkedList() {this.head = null;}

    /*****************************Instance Methods***************************/

    /*Inserts a new node to the head of the LinkedList*/
    public void insert(int valueToInsert) {
        Node latestNode = new Node(valueToInsert, this.head);
        this.head = latestNode;
    }

    /*Searches for a nodes value to contain the given parameter, if found returns true*/
    public boolean includes(int searchValue) {
        Node current = this.head;
        while (current != null) {
            if (searchValue == current.valueStored) {
                return true;
            }
            else{
                current = current.nextNode;
            }
        }
        return false;
    }

    /*Adds a node to the end of the LinkedList*/
    public void append(int valueToAppend){
        Node newLastNode = new Node(valueToAppend, null);
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.nextNode == null){
                currentNode.nextNode = newLastNode;
                newLastNode.nextNode = null;
            }
            else {
                currentNode = currentNode.nextNode;
            }
        }
    }

    /*Insets a new node before the target value of another node*/
    public void insertBefore(int valueToInsert, int targetValue){
        Node newValueNode;
        Node currentNode = head;
        if (currentNode != null){ //This seems more like a try, or circumstantial validation entry point
            while(currentNode.nextNode.valueStored != targetValue){
                currentNode = currentNode.nextNode;
            }
            newValueNode = new Node(valueToInsert, currentNode.nextNode);
            currentNode.nextNode = newValueNode;
        }
    }

    /*Insets a new node after the target value of another node*/
    public void insertAfter(int valueToInsert, int targetValue){
        Node newValueNode;
        Node currentNode = head;
        if (currentNode != null){ //This seems more like a try, or circumstantial validation entry point
            while(currentNode.valueStored != targetValue){
                currentNode = currentNode.nextNode;
            }
            newValueNode = new Node(valueToInsert, currentNode.nextNode);
            currentNode.nextNode = newValueNode;
        }
    }

    /*Searches for a node that is (k) nodes from tail*/
    public int getKFromTail(int k){
        LinkedList newLL = new LinkedList();
        Node current = this.head;
        while (current.nextNode != null){
            newLL.insert(current.valueStored);
            current = current.nextNode;
        }
        if(newLL.head != null) {
            int count = k - 1;
            current = newLL.head;
            while (count < k) {
                current = current.nextNode;
                count++;
            }
        }
        return current.valueStored;
    }

    /*Merges two LinkedLists alternatively*/
    public LinkedList mergeLists(LinkedList ll1, LinkedList ll2){
        LinkedList mergedLL = new LinkedList();

        //both heads are valid head nodes
        if(ll1.head != null && ll2.head != null){
            Node c1, c2;
            c1 = ll1.head;
            c2 = ll2.head;
            /** GO THROUGH BOTH lINKEDlISTS ONE NODE AT A TIME UNTIL:
             *  ONE OF THESE NODES NEXT VALUE IS A NULL,
             *  THEN TRAVERSE THROUGH THE LEFTOVER lINKED LIST UNTIL
             *  THE SAME CONDITION IS MET FOR THIS LINKEDLIST
             *  */

        //only ll1 has a valid head node
        } else if (ll1.head != null && ll2.head == null){
            Node c1;
            c1 = ll1.head;
            while(c1.nextNode != null){
                mergedLL.insert();
            }

            //only ll2 has a valid head node
        } else if (ll1.head == null && ll2.head != null){
            Node c2;
            c2 = ll2.head;


        } else{
        //both ll1 & ll2 have null heads, so do not add any new nodes to our new LinkedList
        }
    return mergedLL;
    }

    /*Prints entirety of this LinkedList*/
    public void print() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.valueStored + " ");
        }
    }

    /*uhhhhhhhh...*/
    public String toString(){
        return "";
    }

}