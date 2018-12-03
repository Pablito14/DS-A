package util;

public class Node {

    //instance variables
    public int valueStored;
    public Node nextNode;

    //constructor
    public Node(int incomingValue){
        this.valueStored = incomingValue;
        this.nextNode = null;
    }
}
