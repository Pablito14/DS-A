package graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class EdgeTest {

  Graph graph = new Graph();

  //Making Nodes
  Node<Integer> a = new Node<Integer> (1);
  Node<Integer> b = new Node<Integer> (2);
  Node<Integer> c = new Node<Integer> (3);

// I cant get my code to work how I am intending it to.
//  graph.addNode(a);

  //Making Edges
  Edge<Integer> ab = new Edge(a);
  Edge<Integer> ba = new Edge(b);


  @Test
  public void testEdge(){
    assertTrue("There should be an edge from A to B", a.neighbors.contains(b));
    assertFalse("There should not be an edge from A to C", a.neighbors.contains(c));
  }
}