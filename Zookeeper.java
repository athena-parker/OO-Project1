import java.util.Scanner;

class Zookeeper extends ZooEmployee {
    Context context;
    Zookeeper(String name_) {
        personName = name_;
    }
    public void makeEvent(String event_) { //for each event, try to send observer the message
        setChanged();
        Message m = new Message(event_);
        notifyObservers(m);
    }
    //zookeeper methods: modifying zoo employee methods
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
    public void RollCall(Animal[] animals_) {
        System.out.println("Time to RollCall the animals");
        for(int i = 0; i < 20; i++){
            System.out.println("Zookeeper " + personName + " calls " + animals_[i].name + " the " + animals_[i].type + ".");
            System.out.print(animals_[i].name + " the " + animals_[i].type + " says ");

            //all this is bc do not know how to create new context w/o creating new animal.
            if (animals_[i].type == "Lion") {
                context = new Context (new Lion("Joe"));
            } else if (animals_[i].type == "Cat") {
                context = new Context(new Cat("Joe"));
            } else if (animals_[i].type == "Tiger") {
                context = new Context(new Tiger("Joe"));
            } else if (animals_[i].type == "Dog") {
                context = new Context(new Dog("Joe"));
            } else if (animals_[i].type == "Wolf") {
                context = new Context(new Wolf("Joe"));
            } else if (animals_[i].type == "Hippo") {
                context = new Context(new Hippo("Joe"));
            } else if (animals_[i].type == "Elephant") {
                context = new Context(new Elephant("Joe"));
            } else if (animals_[i].type == "Rhino") {
                context = new Context(new Rhino("Joe"));
            } else if (animals_[i].type == "Frog") {
                context = new Context(new Frog("Joe"));
            } else if (animals_[i].type == "Salamander") {
                context = new Context(new Salamander("Joe"));
            }

            System.out.println(context.executeStrategy()); //STRATEGY PATTERN
        }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //take user input for # of days
        int days = 0;
        while(days <= 0) {
            System.out.println("Enter number of days");
            days = sc.nextInt();
        }
        //IDENTITY: each object is unique and has its own ID
        //make Zookeeper
        Zookeeper John = new Zookeeper("John");
        ZooAnnouncer Bob = new ZooAnnouncer("Bob", John);
        John.addObserver(Bob); //zoo announcer is now observing zoo keeper
        //Make Felines
        Lion Levi = new Lion("Levi");
        Lion Lily = new Lion("Lily");
        Cat Carter = new Cat("Carter");
        Cat Chompy = new Cat ("Chompy");
        Tiger Tyrone = new Tiger("Tyrone");
        Tiger Timbo = new Tiger("Timbo");

        //Make Canine
        Dog Darryl = new Dog("Darryl");
        Dog Denny = new Dog("Denny");
        Wolf Wendy = new Wolf("Wendy");
        Wolf Wiggles = new Wolf("Wiggles");

        //Make Pachyderm
        Hippo Holly = new Hippo("Holly");
        Hippo Hibbert = new Hippo ("Hibbert");
        Elephant Ernesto = new Elephant("Ernesto");
        Elephant Esteban = new Elephant("Esteban");
        Rhino Rotini = new Rhino("Rotini");
        Rhino Rigatoni = new Rhino("Rigatoni");

        //Make Amphibian
        Frog FranzFerdinand = new Frog("FranzFerdinand");
        Frog FredFerdinand = new Frog("FredFerdinand");
        Salamander Shannon = new Salamander("Shannon");
        Salamander Susan = new Salamander("Susan");

        //store animals in array
        Animal[] zooAnimals = new Animal[20]; //POLYMORPHISM - making array of Animal objects, in reality, all Animal subclasses
        zooAnimals[0] = Levi;
        zooAnimals[1] = Lily;
        zooAnimals[2] = Carter;
        zooAnimals[3] = Chompy;
        zooAnimals[4] = Tyrone;
        zooAnimals[5] = Timbo;
        zooAnimals[6] = Darryl;
        zooAnimals[7] = Denny;
        zooAnimals[8] = Wendy;
        zooAnimals[9] = Wiggles;
        zooAnimals[10] = Holly;
        zooAnimals[11] = Hibbert;
        zooAnimals[12] = Ernesto;
        zooAnimals[13] = Esteban;
        zooAnimals[14] = Rotini;
        zooAnimals[15] = Rigatoni;
        zooAnimals[16] = FranzFerdinand;
        zooAnimals[17] = FredFerdinand;
        zooAnimals[18] = Shannon;
        zooAnimals[19] = Susan;

        for (int i = 1; i <= days; i = i + 1){ // loop through the days
            Bob.Arrive(i);
            John.makeEvent("arrive"); //arrive event, etc
            John.Arrive(i);

            John.makeEvent("wake the animals");
            for(int j = 0; j < 20; j++){ //wake all the animals first
                John.WakeAnimals(zooAnimals[j]);
            }

            John.makeEvent("roll call the animals");
            John.RollCall(zooAnimals); //call all the animals

            John.makeEvent("feed, exercise, and put the animals to sleep");
            for(int j = 0; j < 20; j++){ //feed, exercise, and put all animals to bed
                John.FeedAnimals(zooAnimals[j]);
                John.ExerciseAnimals(zooAnimals[j]);
                John.SleepAnimals(zooAnimals[j]);
            }
            John.makeEvent("leave");
            John.Leave(i);
            Bob.Leave(i);
        }
    }
}
