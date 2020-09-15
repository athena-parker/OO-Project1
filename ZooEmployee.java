//import project1.java;

public abstract class ZooEmployee {

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
        Zookeeper John = new Zookeeper();
        System.out.println("Hello World!");
        /*for (int i = 1; i <= 7; i = i + 1){
            //stuff
        }*/
    }
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

/*class project1 {
    public static void main(String[] args) {
        Zookeeper John = new Zookeeper();
        System.out.println("Hello World!");
        for (int i = 1; i <= 7; i = i + 1){
            //stuff
        }
    }
}*/