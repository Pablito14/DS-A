package util;
import java.util.ArrayList;

public class LinkedList {

    //instance variables
    private Node head;

    //constructor
    public LinkedList() {
        this.head = null;
    }

    /*instance methods*/
    public void insert(int valueToInsert) {
        Node latestNode = new Node(valueToInsert, this.head);
        this.head = latestNode;
    }

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

    public void print() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.valueStored + " ");
        }

    }

    public Node getHead(){
        return this.head;
    }

    public String toString(){
        return "";
    }

}