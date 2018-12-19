package StacksAndQueues;

public class Node<T> {

    //instance variables
    public T valueStored;
    public Node<T> nextNode;

    //constructor
    public Node(T valueStored, Node<T> nextNode){
        this.valueStored = valueStored;
        this.nextNode = nextNode;
    }

    public Node(T valueStored){
        this.valueStored = valueStored;
        this.nextNode = null;
    }
}
