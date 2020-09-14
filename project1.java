//main for every class?
//instantiate objects in its own class or all in one main function?
//syntax for modifying a function in a subclass

class Animal {
  String name;
  String type;
  int day;
  public static void wakeUp();
  public static void makeNoise();
  public static void eat();
  public static void roam();
  public static void sleep();
}

class Feline extends Animal {

}

class Lion extends Feline {

}

class Cat extends Feline {

}

class Tiger extends Feline {

}

class Canine extends Animal {

}

class Dog extends Canine {

}

class Wolf extends Canine {

}

class Pachyderm extends Animal {

}

class Hippo extends Pachyderm {

}

class Elephant extends Pachyderm {

}

class Rhino extends Pachyderm {

}

class Amphibian extends Animal {

}

class Frog extends Amphibian {

}

class Salamander extends Amphibian {

}

public abstract class ZooEmployee {
  public static void WakeAnimals();
  public static void RollCall();
  public static void FeedAnimals();
  public static void ExerciseAnimals();
  public static void SleepAnimals();
}

class Zookeeper extends ZooEmployee {
  public static void main(String[] args) {
    Zookeeper John = new Zookeeper();
  }
}
