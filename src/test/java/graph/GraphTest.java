package graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class GraphTest {

  Graph g = new Graph();

  @Test
  public void graphTest(){
    assertTrue("This graph should be instantiated with no amount of nodes saved within it.", g.allNodes.isEmpty());
    assertNotNull("This should graph not be null", g);
    assertFalse("Should have zero nodes/vertices" , g.allNodes.size() > 0);
  }


  @Test
  public void addEdgeTest() {
    Node a = g.addNode(0);
    Node b = g.addNode(1);
    Node c = g.addNode(2);
    assertTrue("there shouldn't be a connection between a & b." , a.neighbors.isEmpty());
    assertTrue("there shouldn't be a connection between b & a." , b.neighbors.isEmpty());
    g.addEdge(a, b);
    assertTrue("there should be a connection between a & b." , a.neighbors.size() == 1);
    assertTrue("there should be a connection between b & a." , b.neighbors.size() == 1);
    assertFalse("Vertex c should not be connected to either vertex." , c.neighbors.size() < 1);
  }


  @Test
  public void getNeighborsTest() {
    Node d = g.addNode(4);
    Node e = g.addNode(5);
    Node f = g.addNode(6);
    assertTrue("No edges should exist" , d.neighbors.size() == 0);
    assertTrue("No edges should exist" , e.neighbors.size() == 0);
    assertTrue("No edges should exist" , f.neighbors.size() == 0);
    g.addEdge(d, e);
    assertTrue("Stuff" , d.neighbors.size() > 0);

  }

  @Test
  public void getNodesTest() {
    Node z = g.addNode(9);
    assertEquals(1, g.allNodes.size());
  }

  @Test
  public void sizeTest() {
    Node a = g.addNode(0);
    Node b = g.addNode(1);
    Node c = g.addNode(2);
    assertEquals(3, g.size());
  }
}