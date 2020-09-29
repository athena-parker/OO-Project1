import java.util.Random;

abstract class Feline extends Animal implements Noise { //30% roams, 30% makes noise, 40% sleeps
    public void sleep() {
        Random rand_feline = new Random();
        int random_int = rand_feline.nextInt(100);
        if (random_int < 30) { //30%
            System.out.println(name + " the " + type + " roams.");
        }
        else if (random_int < 60) { //30%
            makeNoise();
        }
        else { //40%
            System.out.println(name + " the " + type + " sleeps.");
        }
    }
}