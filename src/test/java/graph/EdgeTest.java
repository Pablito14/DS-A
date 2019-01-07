package graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class EdgeTest {

  //Making Nodes
  Node a = new Node (1);
  Node b = new Node (2);
  Node c = new Node (3);

  //Making Edges
  Edge ab = new Edge(a, b);


  @Test
  public void testEdge(){
    assertTrue("There should be an edge from A to B", a.neighbors.contains(b));
    assertFalse("There should not be an edge from A to C", a.neighbors.contains(c));
  }
}