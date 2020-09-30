class ZooFoodServer extends ZooEmployee{
    Context context;
    ZooFoodServer(bean sourcebean) {
        super(sourcebean);
    }
    public void makeEvent(String event_) { //for each event, try to send observer the message
        event = event_;
    }
    public void Arrive(int day){
        System.out.println("ZooFoodServer " + personName + " arrives at the Zoo on Day " + day);
    }
    public void Leave(int day){
        System.out.println("ZooFoodServer " + personName + " ends Day " + day + " and leaves the Zoo.\n");

    }
    public void MakeFood() {
        System.out.println("ZooFoodServer " + personName + " is making food.");
    }
    public void ServeFood() {
        System.out.println("ZooFoodServer " + personName + " is serving food.");
    }
    public void Clean() {
        System.out.println("ZooFoodServer " + personName + " is cleaning up.");
    }
}