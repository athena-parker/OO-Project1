import java.util.Observable;

//zooemployee extends observable because zookeeper cannot extend observable and zooemployee
public abstract class ZooEmployee extends Observable { //ABSTRACTION - public class of methods provided

    protected String personName;

    public static void WakeAnimals(){
        System.out.println("The Zookeeper wakes the animals");
    }
    public static void RollCall(){
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
}