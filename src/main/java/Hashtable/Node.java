package Hashtable;

// This code was done in class alongside Michelle Ferreirae's code review of Jeff Borda's implementation of Hashtables.
public class Node<T> {

  /*Instance variables*/
  public String key;
  public T value;
  public Node next;

  /*Constructors*/

  //Default constructor
  public Node(){
    this.next = null;
  }

  //Constructor
  public Node(String key, T value, Node next){
    this.key = key;
    this.value = value;
    this.next = next;
  }

  /*Instance Method(s)*/
  @Override
  public String toString(){
    return " (Key: " + this.key + " | Value: " + this.value + " | Next: " + this.next + ")";
  }
}
