package FIFOAnimalShelter;
import StacksAndQueues.*;

public class FIFOAnimalShelter {
  private Queue cat;
  private Queue dog;

  public FIFOAnimalShelter() {
    this.cat = new Queue();
    this.dog = new Queue();
  }

  public void enQueue(Animal.Cat animal) {
    this.cat.enqueue(animal);
  }

  public void enQueue(Animal.Dog animal) {
    this.dog.enqueue(animal);
  }

  public Object dequeue(Animal.Cat animal) {
    return this.cat.dequeue();
  }

  public Object dequeue(Animal.Dog animal) {
    return this.dog.dequeue();
  }

  public Object dequeue() {
    return null;
  }
  // ANIMAL CLASS:

// cat & dog classes
//name instance variable ( a string)
//constructor: just takes in a name(string)
//methods: just a toString?

public class Animal {
  public class Cat {
    private String name = "";

    public Cat() {
    }

    public Cat(String name) {
      this.name = name;
    }

    public String toString() {
      return name;
    }
  }

    public class Dog {
      private String name = "";

      public Dog() {
      }

      public Dog(String name) {
        this.name = name;
      }

      public String toString() {
        return name;
      }
    }
  }
}