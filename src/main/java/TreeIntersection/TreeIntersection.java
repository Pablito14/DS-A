package TreeIntersection;

import Tree.*;
import Hashtable.*;
import Tree.Node;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeIntersection {

  public int[] treeIntersection(Tree<Node<Integer>> a, Tree<Node<Integer>> b){

    //data structures to use
    HashSet<Integer> seen;
    ArrayList<Integer> dupelicateList;
    int[] dupelicateArray;

    //traverse through the first tree adding all the nodes values to a hash set

    //once the first tree has been processed, check each node in the second tree to see if it has been seen,
      // if it has been seen, add it to the arrraylist and proceed
      // if it hasnt been seen, add it to the hash set and proceed
    //once all nodes have been processed we need to convert the arrayList into an array

  //BUS DRIVER, MOVE THAT BUS!
    return dupelicateArray;
  }


}
