import java.util.Random;

class Dog extends Canine implements Noise { //modify makenoise, 25% digs, 75% roams
    Dog(String name_){
        name = name_;
        type = "Dog";
    }
    public String getNoise() {
        return "Bark!";
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