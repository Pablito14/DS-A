package graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class GraphTest {

  Graph g = new Graph();

  @Test
  public void graphTest(){
    assertTrue("This graph should be instantiated with no amount of nodes saved within it.", g.allNodes.isEmpty());
  }

//  @Test
//  public void addNodeTest() {
//    assertTrue("Adding Node A, should be within graph", g.addNode(1))
//  }

  @Test
  public void addEdgeTest() {

  }


  @Test
  public void getNeighborsTest() {

    //weighted tests

  }

  @Test
  public void getNodesTest() {

  }

  @Test
  public void sizeTest() {

  }
}