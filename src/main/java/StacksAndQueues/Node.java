package StacksAndQueues;

public class Node {

    //instance variables
    private int valueStored;
    private Node nextNode;

    //getters
    public int getValueStored(){return valueStored;}
    public Node getNextNode(){return nextNode;}

    //constructor
    public Node(int incomingValue, Node nextNode){
        this.valueStored = incomingValue;
        this.nextNode = nextNode;
    }
}
