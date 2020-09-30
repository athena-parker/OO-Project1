import java.beans.PropertyChangeSupport;

//zooemployee extends observable because zookeeper cannot extend observable and zooemployee
public abstract class ZooEmployee extends PropertyChangeSupport { //ABSTRACTION - public class of methods provided

    protected String personName;
    protected String event;

    /**
     * Constructs a {@code PropertyChangeSupport} object.
     *
     * @param sourceBean The bean to be given as the source for any events.
     */
    public ZooEmployee(bean sourceBean) {
        super(sourceBean);
    }

    public void setName(String name) { //for each event, try to send observer the message
        personName = name;
    }
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