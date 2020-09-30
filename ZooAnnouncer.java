import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ZooAnnouncer extends ZooEmployee implements PropertyChangeListener { //OBSERVER PATTERN

    public ZooAnnouncer(bean sourcebean) {
        super(sourcebean);
    }

    public void Arrive(int day) {
        System.out.println("ZooAnnouncer " + personName + " arrives at the Zoo on Day " + day);
    }

    public void Leave(int day) {
        System.out.println("ZooAnnouncer " + personName + " ends Day " + day + " and leaves the Zoo.\n");
    }

    public void propertyChange(PropertyChangeEvent event) { //whenever event changes, zoo announcer announces.
        if (event.getOldValue() != event.getNewValue()) {
            System.out.println("Hi, this is the Zoo Announcer. " + event.getNewValue() + "!");
        }
    }
}