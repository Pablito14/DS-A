package graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {

  //Making Nodes
  Node a = new Node (1);
  Node b = new Node (2);
  Node c = new Node (3);

  @Test
  public void testNode(){
    assertTrue("This checks to see if the node constructors are working, node a = 1", a.value == 1);
    assertTrue("node b =2", b.value == 2);
    assertTrue("node c =3", b.value == 3);
  }

  @Test
  public void testNeighbors(){
    assertFalse("This checks to see if the node constructors are working, Node A is not connected to Node B", a.neighbors.contains(b));
    assertFalse("Node A is not connected to Node C", a.neighbors.contains(c));
    assertFalse("Node B is not connected to Node C", b.neighbors.contains(c));
  }

}