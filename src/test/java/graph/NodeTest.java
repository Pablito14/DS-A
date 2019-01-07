package graph;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

  //Making Nodes
  Node a = new Node (1);
  Node b = new Node (2);

  //Making a connection between Nodes
  b.neighbors.add(a);

  @Test
  public void testNode(){
    assertTrue("This checks to see if the node constructors are working, node a = 1", a.value == 1);
    assertTrue("node b =2", b.value == 2);
  }

}