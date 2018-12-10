package StacksAndQueues;

public class Stack {

    //instance variables
    private Node top = null;

    //constructors
    public Stack(){
        this.top = null;
    }

    /**instance methods*/
    public void push(int value){
        Node temp = new Node(value, top.getNextNode());
        top = temp;
    }

    public int pop(){
        Node temp = top;
        top = top.getNextNode();
        return temp.getValueStored(); //Is it still part of the Stack at this point?
    }

    public Node peek(){return top;}

}
