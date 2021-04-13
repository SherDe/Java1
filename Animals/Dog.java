package Animals;

public class Dog extends Animals{
    public int sweem;


    public Dog(String name, int run, int sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
    }
    public void dogInfo() {
        System.out.println("DogName: " + name  + " Run " + run+ " meters " + " Sweem:" + sweem + " meters");
    }
}
