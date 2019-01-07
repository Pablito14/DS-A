package graph;

import java.util.ArrayList;
import java.util.List;


public class Graph {

  /*Instance Variables*/
  List<Node> allNodes;

  /*Constructors*/
  public Graph(){
    this.allNodes = new ArrayList<>();
  }

  /*Instance Methods*/
  public Node addNode(int value) {
    Node n = new Node(value);
    allNodes.add(n);
    return n;
  }

  public static void addEdge(Node a, Node b) {
    Edge edge = new Edge(a, b);
    a.neighbors.add(b);
  }

  //With weight
  public static void addEdge(Node a, Node b, int weight) {
    Edge edge = new Edge(a, b, weight);
    a.neighbors.add(b);
  }

  public List<Node> getNeighbors(Node origin) {
    return origin.neighbors;
  }

  public List<Node> getNodes() {
    return allNodes;
  }

  public int size(){
    return allNodes.size();
  }

}
