package Employee;

public class MainEmployee {


    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Tim", "Tim34@mail.ru", 34, 5689456, "research associate", 10000);
        employees[1] = new Employees("Tom", "Tom41@mail.ru", 41, 3245671, "research associate", 10000 );
        employees[2] = new Employees("Maks", "Maks27@mail.ru", 27, 6234454, "research associate", 10000);
        employees[3] = new Employees("Jake", "Jake32@mail.ru", 45, 8567567, "research associate", 10000);
        employees[4] = new Employees("Jain", "Jain21@mail.ru", 21, 9234567, "research associate", 10000);
        for (Employees employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }

}