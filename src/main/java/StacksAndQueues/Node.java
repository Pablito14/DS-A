package StacksAndQueues;

public class Node {

    //instance variables
    protected int valueStored;
    protected Node nextNode;

    //getters
    public int getValueStored(){return valueStored;}
    public Node getNextNode(){return nextNode;}

    //constructor
    public Node(int valueStored, Node nextNode){
        this.valueStored = valueStored;
        this.nextNode = nextNode;
    }
}
