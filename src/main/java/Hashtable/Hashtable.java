package Hashtable;

import java.util.LinkedList;
import java.util.Random;

// This code was done in class alongside Michelle Ferreirae's code review of Jeff Borda's implementation of Hashtables.
public class Hashtable<T>{

  /*Instance variables*/
  public LinkedList<Node<T>>[] table; // making an array of linked lists that hold nodes of <T> type
  public final double RANDO;
  public int load;

  /*Constructor(s)*/
  public Hashtable(){
    this.table = new LinkedList[16]; // initial size because of Java docs & Venicio's advice from Fridays lecture
    Random r = new Random();
    this.RANDO = r.nextDouble();
    this.load = 0;
  }

  /*Instance methods*/
  public void add(String insertionKey, T insertionValue){

  }

//  TODO:find

//  TODO:contains

//  TODO:getHash

//  TODO:repeatedWord


}
