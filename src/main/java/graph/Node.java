package graph;

import java.util.ArrayList;
import java.util.List;

public class Node {

  public int value;
  public List<Node> neighbors;

  public Node(int value){
    this.value = value;
    this.neighbors = new ArrayList<>();
  }

}
