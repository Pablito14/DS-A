package Tree;
import java.util.ArrayList;
class Tree<T> {

  public Node<T> root;

  public Object[] inOrder() {
    return Tree.inOrderRecursiveHelper(this.root).toArray();
  }

  private static ArrayList<Node> inOrderRecursiveHelper(Node root) {
    if (root == null) {
      return new ArrayList<Node>();
    } else {
      ArrayList<Node> left = inOrderRecursiveHelper(root.left);
      ArrayList<Node> right = inOrderRecursiveHelper(root.right);
      left.add(root);
      right.add(root);
      return left;
    }
  }
  
}
