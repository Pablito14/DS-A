package Tree;

public class Node {
  /*Instance variables*/
  public int value;
  public Node left;
  public Node right;
  public Node parent; //Potentially useful?

  /*Constructor*/
  public Node(int value, Node left, Node right){
    this.value = value;
    this.left = left;
    this.right = right;
    this.parent = null;
  }

}
