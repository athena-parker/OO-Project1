//import project1.java;

import java.util.Scanner;

public abstract class ZooEmployee {

    protected String personName;

    public static void WakeAnimals(){
        System.out.println("The Zookeeper wakes the animals");
    }
    public void RollCall(){
        System.out.println("The Zookeeper counts the animals");
    }
    public static void FeedAnimals(){
        System.out.println("The Zookeeper feeds the animals");
    }
    public static void ExerciseAnimals(){
        System.out.println("The Zookeeper tells the animals to run around");
    }
    public static void SleepAnimals(){
        System.out.println("The Zookeeper turns off the lights");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = 0;
        while(days <= 0) {
            System.out.println("Enter number of days");
            days = sc.nextInt();
        }

        //make Zookeeper
        Zookeeper John = new Zookeeper("John");

        //Make Felines
        Lion Levi = new Lion("Levi");
        Cat Carter = new Cat("Carter");
        Tiger Tyrone = new Tiger("Tyrone");

        //Make Canine
        Dog Darryl = new Dog("Darryl");
        Wolf Wendy = new Wolf("Wendy");

        //Make Pachyderm
        Hippo Holly = new Hippo("Holly");
        Elephant Ernesto = new Elephant("Ernesto");
        Rhino Rotini = new Rhino("Rotini");

        //Make Amphibian
        Frog FranzFerdinand = new Frog("FranzFerdinand");
        Salamander Shannon = new Salamander("Shannon");

        //store animals in array
        Animal[] zooAnimals = new Animal[10];
        zooAnimals[0] = Levi;
        zooAnimals[1] = Carter;
        zooAnimals[2] = Tyrone;
        zooAnimals[3] = Darryl;
        zooAnimals[4] = Wendy;
        zooAnimals[5] = Holly;
        zooAnimals[6] = Ernesto;
        zooAnimals[7] = Rotini;
        zooAnimals[8] = FranzFerdinand;
        zooAnimals[9] = Shannon;



        //System.out.println("Hello World!");
        for (int i = 1; i <= days; i = i + 1){
            John.Arrive(i);
            for(int j = 0; j < 10; j++){
                John.WakeAnimals(zooAnimals[j]);
                John.RollCall(zooAnimals[j]);
                John.FeedAnimals(zooAnimals[j]);
                John.ExerciseAnimals(zooAnimals[j]);
                John.SleepAnimals(zooAnimals[j]);
            }
            John.Leave(i);
        }
    }
}

class Zookeeper extends ZooEmployee {
    Zookeeper(String name_){
        personName = name_;
    }
    public void Arrive(int day){
        System.out.println("Zookeeper " + personName + " arrives at the Zoo on Day " + day);

    }
    public void Leave(int day){
        System.out.println("Zookeeper " + personName + " ends Day " + day + " and leaves the Zoo.\n");

    }
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

/*class project1 {
    public static void main(String[] args) {
        Zookeeper John = new Zookeeper();
        System.out.println("Hello World!");
        for (int i = 1; i <= 7; i = i + 1){
            //stuff
        }
    }
}*/