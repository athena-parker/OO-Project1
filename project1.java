//main for every class?
//instantiate objects in its own class or all in one main function?
//syntax for modifying a function in a subclass
//classes with no modifications? blank?

import java.util.Random;

class Animal {
  protected String name;
  protected String type;
  protected int day;
  public void wakeUp() {
    System.out.println(name + " the " + type + " wakes up.");
  }
  public void makeNoise(){
    System.out.println(name + " the " + type + " goes awoowowiwjaoaoaoaoa ");
  }
  public void eat() {
    System.out.println(name + " the " + type + " eats.");
  }
  public void roam() {
    System.out.println(name + " the " + type + " roams.");
  }
  public void sleep() {
    System.out.println(name + " the " + type + " sleeps.");
  }
}

class Feline extends Animal {
  public void sleep() {
    Random rand_feline = new Random();
    int random_int = rand_feline.nextInt(100);
    if (random_int < 30) { //30%
      System.out.println(name + " the " + type + " roams.");
    }
    else if (random_int < 60) { //30%
      makeNoise();
    }
    else { //40%
      System.out.println(name + " the " + type + " sleeps.");
    }
  }
}

class Lion extends Feline {
  public void makeNoise() {
    System.out.println("Roar!");
  }
}

class Cat extends Feline {
  public void makeNoise() {
    System.out.println("Meow!");
  }
}

class Tiger extends Feline {
  public void makeNoise() {
    System.out.println("Growl!");
  }
}

abstract class Canine extends Animal {

}

class Dog extends Canine {
  public void makeNoise() {
    System.out.println("Bark!");
  }
  public void roam() {
    Random rand_dog = new Random();
    if (rand_dog.nextInt(100) < 25) { //25%
      System.out.println(name + " the " + type + " digs.");
    }
    else {
      System.out.println(name + " the " + type + " roams.");
    }
  }
}

class Wolf extends Canine {
  public void makeNoise() {
    System.out.println("Woof!");
  }
}

class Pachyderm extends Animal {
  public void roam() {
    Random rand_pachy = new Random();
    if (rand_pachy.nextInt(100) < 25) { //25%
      System.out.println(name + " the " + type + " charges.");
    }
    else {
      System.out.println(name + " the " + type + " roams.");
    }
  }
}

class Hippo extends Pachyderm {
  public void makeNoise() {
    System.out.println("Grunt!");
  }
}

class Elephant extends Pachyderm {
  public void makeNoise() {
    System.out.println("Hooooooo!");
  }
}

class Rhino extends Pachyderm {
  public void makeNoise() {
    System.out.println("Moo!");
  }
}

abstract class Amphibian extends Animal {

}

class Frog extends Amphibian {
  public void makeNoise() {
    System.out.println("Ribbit!");
  }
}

class Salamander extends Amphibian {
  public void makeNoise() {
    System.out.println("Pop!");
  }
}


