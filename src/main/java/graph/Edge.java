package graph;

public class Edge {

  public int weight;
  public Node owner, neighbor;

  public Edge(Node owner, Node neighbor){
    this.owner = owner;
    this.neighbor = neighbor;
    owner.neighbors.add(neighbor);
  }
/*With weight*/
  public Edge(Node owner, Node neighbor, int weight){
    this.owner = owner;
    this.neighbor = neighbor;
    this.weight = weight;
    owner.neighbors.add(neighbor);
  }
}
