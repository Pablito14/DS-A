package Tree;

import java.util.ArrayList;

public class BinaryTree {

  /*Instance variables*/
  public Node root;
  public int nodes;

  /*Constructors*/
  public BinaryTree(){
    this.root = null;
  }

  public BinaryTree(int value){
    this.root = new Node(value, null, null);
    this.nodes = 1;
  }

  /*Instance methods*/
  public static ArrayList<Integer> preOrder(Node node, ArrayList<Integer> list)
  {
    if(node == null)
      return list;

    preOrder(node.right, list);
    list.add(node.value);
    preOrder(node.left, list);

    return list;
  }

  public static ArrayList<Integer> inOrder(Node node, ArrayList<Integer> list)
  {
    if(node == null)
      return list;

    inOrder(node.left, list);
    list.add(node.value);
    inOrder(node.right, list);

    return list;
  }

//  public static Array postOrder(BinaryTree tree){
//
//    int[] answer = {0,1};
//    return answer;
//  }

}
