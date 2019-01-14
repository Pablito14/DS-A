package graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class EdgeTest {

  Graph graphite = new Graph();

  Node a = graphite.addNode(1);
  Node b = graphite.addNode (2);
  Node c = graphite.addNode(3);

  @Test
  public void testEdge(){
    graphite.addEdge(a, b);
    assertTrue("There should be an edge from A to B", a.neighbors.size() == 1);
    assertTrue("There should be an edge from B to A", b.neighbors.size() == 1);
    assertFalse("There should not be an edge from A to C", c.neighbors.size() > 1);
  }
}