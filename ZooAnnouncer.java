import java.util.Observer;
import java.util.Observable;
class ZooAnnouncer extends ZooEmployee implements Observer { //OBSERVER PATTERN
    private Zookeeper zk;

    public ZooAnnouncer(String name_, Zookeeper zk) { //Zookepper is the observable
        personName = name_;
        this.zk = zk;
    }

    public void Arrive(int day) {
        System.out.println("ZooAnnouncer " + personName + " arrives at the Zoo on Day " + day);
    }

    public void Leave(int day) {
        System.out.println("ZooAnnouncer " + personName + " ends Day " + day + " and leaves the Zoo.\n");
    }

    public void update(Observable obs, Object obj) { //the messages. below commented function is the attempt with action
        if (obs == zk) {
            System.out.println("Hi, this is the Zoo Announcer. The Zookeeper is about to " + obj + "!");
        }
    }

//    public void update(Observable obs, Message event_) {
//        if (obs == zk) {
//            System.out.println("Hi, this is the Zoo Announcer. The Zookeeper is about to " + event_.getMessage() + "!");
//        }
//    }

}