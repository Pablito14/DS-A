package Tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {

  @Test
  public void testBinaryTreeConstructor(){
    BinaryTree willy = new BinaryTree();
    assertNull("this tree's root should be null on instantiation.", willy.root);

    BinaryTree billy = new BinaryTree(12);
    assertEquals("this tree's root should be 12 on instantiation.", 12, billy.root.value );

    BinaryTree paigon = new BinaryTree(66);
    paigon.root.left = new Node(6, null, null);
    paigon.root.right = new Node(10000, null, null);
    assertEquals("this tree's root should be 66 on instantiation.", 66, paigon.root.value );
    assertEquals("this tree's first left should be 6.", 6, paigon.root.left.value);
    assertEquals("this tree's first right should be 10000.", 10000, paigon.root.right.value);
  }

  @Test
  public void testPreOrder() {

  }

  @Test
  public void testInOrder() {

  }

  @Test
  public void testPostOrder() {
  }
}