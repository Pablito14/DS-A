package graph;

public class Edge<T> {

  /*Instance Variables*/
  public int weight;
  public Node<T> neighbor;

  //Constructor w/o weights
  public Edge(Node<T> neighbor){
    this.neighbor = neighbor;
    this.weight = 0;
  }

  //Constructor with weight
  public Edge(Node<T> neighbor, int weight){
    this.neighbor = neighbor;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Node:" + this.neighbor + " Edge Weight:" + this.weight;
  }

}
