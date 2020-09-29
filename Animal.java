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