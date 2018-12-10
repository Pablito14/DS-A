package StacksAndQueues;

public class Stack {

    //instance variables
    private Node top = null;

    public Stack(){
        this.top = null;
    }

    public Stack(int firstNode){
        this.top = new Node(firstNode, null);
    }

    /**instance methods*/
    public void push(int value){
        Node temp = new Node(value, top);
        top = temp;
    }

    public int pop(){
        Node temp = top;
        top = top.getNextNode();
        return temp.getValueStored(); //Is it still part of the Stack at this point?
    }

    public Node peek(){return top;}

}
