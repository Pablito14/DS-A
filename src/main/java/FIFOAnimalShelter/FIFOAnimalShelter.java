package FIFOAnimalShelter;
import StacksAndQueues.*;

public class FIFOAnimalShelter{

  protected Queue cat;
  protected Queue dog;

  public FIFOAnimalShelter(){
    this.cat = new Queue();
    this.dog= new Queue();
  }

  public void enQueue(Cat animal){
    this.cat.enqueue(animal);
  }

  public void enQueue(CDogat animal){
    this.dog.enqueue(animal);
  }

  public Object dequeue (Cat animal){
    return this.cat.dequeue();
  }

  public Object dequeue (Dog animal){
    return this.dog.dequeue();
  }

  public Object dequeue (){
    return null;
  }

}

// cat class
//constructor: just takes in a name(string)
//methods: just a toString?

// dog class
//constructor: just takes in a name(string)
//methods: just a toString?