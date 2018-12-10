package StacksAndQueues;

public class Queue {

    //instance variables
    private Node front;
    private Node rear;

    public Node getFront(){return front;}
    public Node getRear(){return rear;}


    //constructor
    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int value){
        Node temp = new Node(value, null);
        rear.nextNode = temp;
        rear = temp;
    }

    public int dequeue(){
        Node temp = getFront();
        front = front.getNextNode();
        return temp.getValueStored();
    }

    public Node peek(){return front;}

}




























