import java.util.Random;

abstract class Pachyderm extends Animal implements Noise { //25% charges, 75% roams
    public void roam() {
        Random rand_pachy = new Random();
        if (rand_pachy.nextInt(100) < 25) { //25%
            System.out.println(name + " the " + type + " charges.");
        }
        else {
            System.out.println(name + " the " + type + " roams.");
        }
    }
}