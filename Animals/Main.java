package Animals;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals("CatsCategory");
        Cat cat = new Cat("Pushok", 200, false);
        Animals.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animals danimal = new Animals("Dogs");
        Dog dog = new Dog("Digi", 500, 10);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}
