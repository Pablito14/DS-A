package util;

public class Node {

    //instance variables
    public int valueStored;
    public Node nextNode;

    //constructor
    public Node(int incomingValue, Node nextNode){
        this.valueStored = incomingValue;
        this.nextNode = nextNode;
    }
}
