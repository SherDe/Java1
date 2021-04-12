package Employee;

public class Employees {
    private final String fio;
    private final int age;
    private final String email;
    private final int telephone;
    public String post;
    private final int salary;


    public int getAge() {
        return age;
    }

    public Employees(String fio, String email, int age, int telephone, String post, int salary) {
        this.fio = fio;
        this.email = email;
        this.age = age;
        this.telephone = telephone;
        this.post = post;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + fio + " Email: " + email + " Age: " + age + " Telephone: " + telephone + " Post: " + post + " Salary: " + salary);
    }



    }
