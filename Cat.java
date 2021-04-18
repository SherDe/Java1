package Animals;

public class Cat extends Animals {

    public Cat() {
        super(200, 0);
    }

    @Override
    public void run(int distance) {
        System.out.printf("Pushok run %s: %s%n", distance <= getMaxRun());

    }
    @Override
    public void swim(int distance) {
        System.out.println("Pushok can not swim");
    }
}