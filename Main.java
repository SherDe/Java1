package Animals;

public class Main {
    public static void main(String[] args) {
        Animals[] animal = {
                new Cat(),
        };
        for (int i = 0; i < animal.length; i++) {
            animal[i].run(150);
            animal[i].swim(20);

        }
    }
}