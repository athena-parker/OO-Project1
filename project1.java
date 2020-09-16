//main for every class?
//instantiate objects in its own class or all in one main function?
//syntax for modifying a function in a subclass
//classes with no modifications? blank?

import java.util.Random;

class Animal { //highest level class for all animals
  protected String name; //ENCALSULATION - listing variables as protected so they will be inherited by sunclasses
  protected String type;
  protected int day;
  public void wakeUp() { //standard animal methods
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

class Feline extends Animal { //30% roams, 30% makes noise, 40% sleeps
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

class Lion extends Feline { //modify makenoise method
  Lion(String name_){
    name = name_;
    type = "Lion";
  }
  public void makeNoise() {
    System.out.println("Roar!");
  }
}

class Cat extends Feline { //modify makenoise
  Cat(String name_){
    name = name_;
    type = "Cat";
  }
  public void makeNoise() {
    System.out.println("Meow!");
  }
}

class Tiger extends Feline { //modify makenoise
  Tiger(String name_){
    name = name_;
    type = "Tiger";
  }
  public void makeNoise() {
    System.out.println("Growl!");
  }
}

abstract class Canine extends Animal { //ABSTRACT CLASS - is not instantiated

}

class Dog extends Canine { //modify makenoise, 25% digs, 75% roams
  Dog(String name_){
    name = name_;
    type = "Dog";
  }
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

class Wolf extends Canine { //modify makenoise
  Wolf(String name_){
    name = name_;
    type = "Wolf";
  }
  public void makeNoise() {
    System.out.println("Woof!");
  }
}

class Pachyderm extends Animal { //25% charges, 75% roams
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

class Hippo extends Pachyderm { //modify makenoise
  Hippo(String name_){
    name = name_;
    type = "Hippo";
  }
  public void makeNoise() {
    System.out.println("Grunt!");
  }
}

class Elephant extends Pachyderm { //modify makenoise
  Elephant(String name_){
    name = name_;
    type = "Elephant";
  }
  public void makeNoise() {
    System.out.println("Hooooooo!");
  }
}

class Rhino extends Pachyderm { //modify makenoise
  Rhino(String name_){
    name = name_;
    type = "Rhino";
  }
  public void makeNoise() {
    System.out.println("Moo!");
  }
}

abstract class Amphibian extends Animal { //abstract class, not instantiated

}

class Frog extends Amphibian { //modify makenoise
  Frog(String name_){
    name = name_;
    type = "Frog";
  }
  public void makeNoise() {
    System.out.println("Ribbit!");
  }
}

class Salamander extends Amphibian { //modify makenoise
  Salamander(String name_){
    name = name_;
    type = "Salamander";
  }
  public void makeNoise() {
    System.out.println("Pop!");
  }
}
