package graph;

public class Edge {

  public int weight;
  public Node a, b;

  public Edge(Node a, Node b){
    this.a = a;
    this.b = b;
  }
/*With weight*/
  public Edge(Node a, Node b, int weight){
    this.a = a;
    this.b = b;
    this.weight = weight;
  }
}
