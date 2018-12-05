package util;
import java.util.ArrayList;

public class LinkedList {

    /*Instance Variables*/
    private Node head;

    /*Constructor*/
    public LinkedList() {
        this.head = null;
    }

    /*Getters*/
    public Node getHead(){
        return this.head;
    }

    /*Instance Methods*/
    /*Inserts new node as the head of the LinkedList*/
    public void insert(int valueToInsert) {
        Node latestNode = new Node(valueToInsert, this.head);
        this.head = latestNode;
    }

    /*Searches for a node with the argument, if found return true*/
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
        while (currentNode != null){
            if(currentNode.nextNode.valueStored == targetValue){
                newValueNode = new Node(valueToInsert, currentNode.nextNode);
                currentNode.nextNode = newValueNode;
                break;
            } else {
                currentNode = currentNode.nextNode;
            }
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