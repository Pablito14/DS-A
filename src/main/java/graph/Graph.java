package graph;

import java.util.ArrayList;
import java.util.List;
import java.security.InvalidParameterException;
import java.util.NoSuchElementException;


public class Graph<T> {

  /*Instance Variables*/
  public List<Node<T>> allNodes;

  /*Constructors*/
  public Graph() {
    this.allNodes = new ArrayList<>();
  }

  /*Instance Methods*/

  //I don't know why we need to return the node after adding it to the graph, but here it is
  public Node<T> addNode(T value) {
    Node<T> n = new Node<>(value);
    this.allNodes.add(n);
    return n;
  }

  // Adding an edge undirected & no weight
  public void addEdge(Node<T> a, Node<T> b) throws NoSuchElementException, InvalidParameterException {
    if (this.allNodes.contains(a) && this.allNodes.contains(b)) {
      if(a == b) {
        throw new InvalidParameterException("Hey, the Nodes can only have edges to different Nodes.");
      } else {
        a.neighbors.add(new Edge(b));
        b.neighbors.add(new Edge(a));
      }
    } else {
      throw new NoSuchElementException("Could'nt find one of the Nodes within the graph.");
    }
  }


  //With weight
  public void addEdge(Node<T> a, Node<T> b, int weight) throws NoSuchElementException, InvalidParameterException {
    if (this.allNodes.contains(a) && this.allNodes.contains(b)) {
      if(a == b) {
        throw new InvalidParameterException("Hey, the Nodes can only have edges to different Nodes.");
      } else {
        a.neighbors.add(new Edge(b, weight));
        b.neighbors.add(new Edge(a, weight));
      }
    } else {
      throw new NoSuchElementException("Could not find one of the Nodes in the graph.");
    }
  }

  public List<Edge<T>> getNeighbors(Node<T> n) {
    return n.neighbors;
  }

  public List<Node<T>> getNodes() {
    return allNodes;
  }

  public int size() {
    return allNodes.size();
  }

//  public

}
