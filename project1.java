//main for every class?
//instantiate objects in its own class or all in one main function?
//syntax for modifying a function in a subclass
//classes with no modifications? blank?

import java.util.Random;

class Animal {
  protected String name;
  protected String type;
  protected int day;
  public static void wakeUp() {
    System.out.println(Animal.name + " the " + Animal.type + " wakes up.");
  }
  public static void makeNoise();
  public static void eat() {
    System.out.println(Animal.name + " the " + Animal.type + " eats.");
  }
  public static void roam() {
    System.out.println(Animal.name + " the " + Animal.type + " roams.");
  }
  public static void sleep() {
    System.out.println(Animal.name + " the " + Animal.type + " sleeps.");
  }
}

class Feline extends Animal {
  public static void sleep() {
    Random rand_feline = new Random();
    int random_int = rand_feline.nextInt(100)
    if (random_int < 30) { //30%
      System.out.println(Animal.name + " the " + Animal.type + " roams.");
    }
    else if (random_int < 60) { //30%
      Animal.makeNoise();
    }
    else { //40%
      System.out.println(Animal.name + " the " + Animal.type + " sleeps.");
    }
  }
}

class Lion extends Feline {
  public static void makeNoise() {
    System.out.println("Roar!");
  }
}

class Cat extends Feline {
  public static void makeNoise() {
    System.out.println("Meow!");
  }
}

class Tiger extends Feline {
  public static void makeNoise() {
    System.out.println("Growl!");
  }
}

abstract class Canine extends Animal {

}

class Dog extends Canine {
  public static void makeNoise() {
    System.out.println("Bark!");
  }
  public static void roam() {
    Random rand_dog = new Random();
    if (rand_dog.nextInt(100) < 25) { //25%
      System.out.println(Animal.name + " the " + Animal.type + " digs.");
    }
    else {
      System.out.println(Animal.name + " the " + Animal.type + " roams.");
    }
  }
}

class Wolf extends Canine {
  public static void makeNoise() {
    System.out.println("Woof!");
  }
}

class Pachyderm extends Animal {
  public static void roam() {
    Random rand_pachy = new Random();
    if (rand_pachy.nextInt(100) < 25) { //25%
      System.out.println(Animal.name + " the " + Animal.type + " charges.");
    }
    else {
      System.out.println(Animal.name + " the " + Animal.type + " roams.");
    }
  }
}

class Hippo extends Pachyderm {
  public static void makeNoise() {
    System.out.println("Grunt!");
  }
}

class Elephant extends Pachyderm {
  public static void makeNoise() {
    System.out.println("Hooooooo!");
  }
}

class Rhino extends Pachyderm {
  public static void makeNoise() {
    System.out.println("Moo!");
  }
}

abstract class Amphibian extends Animal {

}

class Frog extends Amphibian {
  public static void makeNoise() {
    System.out.println("Ribbit!");
  }
}

class Salamander extends Amphibian {
  public static void makeNoise() {
    System.out.println("Pop!");
  }
}

public abstract class ZooEmployee {
  public static void WakeAnimals();
  public static void RollCall();
  public static void FeedAnimals();
  public static void ExerciseAnimals();
  public static void SleepAnimals();
}

class Zookeeper extends ZooEmployee {
  public static void WakeAnimals(Animal animal) {
    System.out.println("Zookeeper wakes " + animal.name + " the " + animal.type + ".");
    animal.wakeUp();
  }
  public static void RollCall(Animal animal) {
    System.out.println("Zookeeper rollcalls " + animal.name + " the " + animal.type + ".");
  }
  public static void FeedAnimals(Animal animal) {
    System.out.println("Zookeeper feeds " + animal.name + " the " + animal.type + ".");
    animal.eat();
  }
  public static void ExerciseAnimals(Animal animal) {
    System.out.println("Zookeeper exercises " + animal.name + " the " + animal.type + ".");
    animal.roam();
  }
  public static void SleepAnimals(Animal animal) {
    System.out.println("Zookeeper puts " + animal.name + " the " + animal.type + " to sleep.");
    animal.sleep();
  }
}

class project1 {
  public static void main(String[] args) {
    Zookeeper John = new Zookeeper();
    for (int i = 1; i <= 7; i = i + 1){
      //stuff
    }
  }
}
