package Tree;
import java.util.ArrayList;
import java.util.Queue;

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
/*
  public static void breadthTraversal(Tree tree) {
    if (tree.root ==null) {
      return;
    }

    Queue<Node> q = new Queue<>();
    q.enQueue(tree.root);

    while (q.front != null) {
      Node front = q.dequeue();

      if (front.left != null) {
        q.enqueue(front.left);
      }

      if (front.right != null) {
        q.enqueue(front.right);
      }

      System.out.println(front.value);
    }

  }
  */
}
