package Animals;

public class Dog extends Animals {

    public Dog() {
        super(150, 10);
    }

    @Override
    public void run(int distance) {
        System.out.printf("Diggi run %s: %s%n", distance <= getMaxRun());

    }
    @Override
    public void swim(int distance) {
        System.out.printf("Diggi run %s: %s%n", distance <= getMaxSwim());
    }
}