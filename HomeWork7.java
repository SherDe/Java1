package HomeWork7;

public class HomeWork7 {

    private static int TIME = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Bobby", 50, 2);
        cat[1] = new Cat("Willi", 20, 3);
        cat[2] = new Cat("Jeik", 100, 3);
        Plate plate = new Plate(200);
        do {
            for (Cat i : cat) {

                if (i.getSatiety() == 0) {

                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    i.eat(plate);
                    System.out.println(i.getName() + " поел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа");
                }

                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("В миске осталось " + plate.getFood() + " граммов корма.\n");
            TIME++;

        } while (TIME <= 3);
    }
}

class Plate {

    private int food;

    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 200;
        System.out.println("Хозяин насыпал 200 грамм корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}

class Cat {

    private String name;
    private int appetite;
    private int satietyTime;
    private int satiety;

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    int getSatietyTime() {
        return satietyTime;
    }

    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    Cat(String name, int appetite, int satietyTime) {

        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety += satietyTime;
    }
}
