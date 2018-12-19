package StacksAndQueues;

public class Queue<T> {

    //instance variables
    public Node<T> front;
    public Node<T> rear;

    /**constructor**/
    //empty instantiation
    public Queue(){
        this.front = null;
        this.rear = null;
    }

    //instantiated with one node
    public Queue(int firstNode){
        Node temp = new Node(firstNode, null);
        front = temp;
        rear = temp;
    }

    public void enqueue(T value){
      if(rear == null){
        rear = new Node<>(value, null);
      }else {
        rear.nextNode = new Node<>(value, null);
        rear = rear.nextNode;
      }
    }

    public T dequeue(){
      if (front != null) {
        Node<T> temp = front;
        this.front = front.nextNode;
        if(front == null){
          rear = null;
        }
        return temp.valueStored;
      }
      return null;
    }

    public Node peek(){return front;}

}




























